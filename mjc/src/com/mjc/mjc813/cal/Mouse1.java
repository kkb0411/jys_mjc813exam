package com.mjc.mjc813.cal;

//Mouse 클래스
class Mouse {
 private int pointX;
 private int pointY;

 // 마우스를 특정 좌표로 이동시키는 메소드
 public void moveMouse(int x, int y) {
     this.pointX = x;
     this.pointY = y;
 }

 // 왼쪽 버튼 클릭 메소드
 public void clickLeftButton() {
     System.out.println("마우스(" + pointX + ", " + pointY + ") 왼쪽버튼 클릭됨");
 }

 // 오른쪽 버튼 클릭 메소드
 public void clickRightButton() {
     System.out.println("마우스(" + pointX + ", " + pointY + ") 오른쪽버튼 클릭됨");
 }
}

//Computer 클래스
class Computer1 {
 private Mouse mouse;

 // 생성자에서 Mouse 객체 초기화
 public Computer1() {
     this.mouse = new Mouse();
 }

 // Mouse를 특정 좌표로 이동하고, 왼쪽 버튼 클릭
 public void clickMouseLeftButton(int x, int y) {
     mouse.moveMouse(x, y);  // 마우스를 해당 좌표로 이동
     mouse.clickLeftButton();  // 왼쪽 버튼 클릭
 }

 // Mouse를 특정 좌표로 이동하고, 오른쪽 버튼 클릭
 public void clickMouseRightButton(int x, int y) {
     mouse.moveMouse(x, y);  // 마우스를 해당 좌표로 이동
     mouse.clickRightButton();  // 오른쪽 버튼 클릭
 }
}

//메인 클래스
public class Mouse1 {
 public static void main(String[] args) {
     // Computer 객체 생성
     Computer1 computer1 = new Computer1();

     // 200, 400 좌표로 마우스 이동 후 왼쪽 버튼 클릭
     computer1.clickMouseLeftButton(200, 400);

     // 600, 800 좌표로 마우스 이동 후 오른쪽 버튼 클릭
     computer1.clickMouseRightButton(600, 800);
 }
}

