import java.util.*;

class Solution {
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> passed = new LinkedList<>(); // 다리를 지난 트럭
        Queue<Truck> passing = new LinkedList<>(); // 다리를 지나고 있는 트럭
        int remain = truck_weights.length; // 지나지 못한 트럭의 개수
        int time = 0;
        int passingSum = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            queue.add(truck_weights[i]);
        }
        
        while (true) {
            time++; // 전체 지난 시간을 의미. 트럭마다 개인의 시간이 존재하지만, 전체 시간은 계속해서 증가 중

            // 통과 중인 트럭의 시간을 업데이트하고, 다리를 다 건넌 트럭을 passed에 추가
            Iterator<Truck> iterator = passing.iterator();
            while (iterator.hasNext()) {
                Truck truck = iterator.next();
                truck.timeAdd();

                if (truck.getTime() >= bridge_length) { // 트럭이 다리를 다 지났음
                    iterator.remove(); // 통과 중인 트럭 리스트에서 삭제
                    passed.add(truck); // passed 리스트로 트럭을 옮김
                    passingSum -= truck.getWeight();
                    if (passingSum < 0) { // 값이 음수가 되면 0으로 바꿔줘야함
                        passingSum = 0;
                    }
                }
            }

            // while문 탈출 조건
            if (passing.isEmpty() && queue.isEmpty()) { // 모든 트럭이 다리를 통과하였음
                break;
            }

            // 대기 트럭에 값이 아직 존재할 경우 진행하고 아닐 경우 이 로직은 제외
            if (!queue.isEmpty()) {
                int next = queue.peek();
                if (weight >= (passingSum + next)) { // 무게가 아직 다리를 통과할 수 있다면
                    Truck now = new Truck(queue.remove(), 0); // 생성자에서 time 초기화
                    passing.add(now); // 트럭이 다리에 올라감
                    passingSum += now.getWeight();
                } else { // 무게가 초과되어 다음 트럭이 올라올 수 없음
                    continue;
                }
            } else { // 대기 트럭에 값이 존재하지 않을 경우
                continue;
            }
        }
        
        return time;
    }
}

class Truck {
    private int weight;
    private int time;
    
    public Truck(int weight, int time) {
        this.weight = weight;
        this.time = time;
    }
    
    public int getWeight() {
        return weight;
    }

    public int getTime() {
        return time;
    }
    
    public void timeAdd() {
        time++;
    }
}
