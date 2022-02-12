package 수정렬하기2_2751_트리정렬;

import java.io.*;
import java.util.*;

//트리 정렬
// 트리정렬의 최악의 경우(최악의 시간복잡도) 방지를 위해 처음에 배열을 한번 랜덤으로 섞는다.(백준 문제풀이용)
//1. 이진 탐색 트리를 중위 순회 방식으로 돌면서 출력하면 정렬된 형태로 나온다.
// 이진 탐색 트리 : 부모 노드의 자식 노드가 왼쪽, 오른쪽 밖에 없는 이진트리 이면서, 왼쪽 자식 노드는 부모 노드보다 값이 작고, 오른쪽 자식 노드는 부모노드보다 값이 크다.
// 왼쪽, 오른쪽 서브트리도 전부 이진 탐색 트리이다.
// 중복된 노드가 없다.
// 노드를 삽입할때, 삽입하는 노드값이 부모-자식 노드의 관계 기준을 고려하며 탐색하다 비어있는 자식노드의 공간에 삽입하면 된다.
// 중위 순회 방식 : 각 노드별로 왼쪽 자식노드 -> root노드 -> 오른쪽 자식 노드 순서대로 호출하는 것을 말한다.(재귀 방식 사용함)

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Integer[] number = new Integer[num];
        for(int i = 0; i < num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        //shuffle 매서드를 이용해 랜덤으로 배열의 원소들을 섞는다.
        List<Integer> list = Arrays.asList(number);
        Collections.shuffle(list);
        list.toArray(number);

        String answer = treeSort(number);
        bw.write(answer);
        bw.flush();
        bw.close();
    }

    public static String treeSort(Integer[] number){
        BinaryTree tree = new BinaryTree();
        for(int i = 0; i < number.length; i++){
            tree.insertNode(number[i]);
        }
        StringBuilder sb = new StringBuilder();
        tree.inorderTree(tree.rootNode, sb);
        return sb.toString();
    }
}

//이진 탐색 트리를 만들기 위한 노드 클래스 생성
class Node{
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}

//이진 탐색 트리 구성과 노드 삽입과 중위 순회 구성
class BinaryTree{
    Node rootNode = null;

    // 노드 삽입 메소드
    public void insertNode(int value){
        if(rootNode == null){
            rootNode = new Node(value);
        }
        else{
            Node parentNode = rootNode;

            while(true){
                if(value < parentNode.value){
                    if(parentNode.leftChild != null){
                        parentNode = parentNode.leftChild;
                        continue;
                    }
                    parentNode.leftChild = new Node(value);
                    break;
                }
                else{
                    if(parentNode.rightChild != null){
                        parentNode = parentNode.rightChild;
                        continue;
                    }
                    parentNode.rightChild = new Node(value);
                    break;
                }
            }
        }
    }

    // 중위 순회 메소드
    public void inorderTree(Node rootNode, StringBuilder sb) {
        if(rootNode.leftChild != null) {
            inorderTree(rootNode.leftChild, sb);
        }

        sb.append(rootNode.value + "\n");

        if(rootNode.rightChild != null) {
            inorderTree(rootNode.rightChild, sb);
        }
    }
}