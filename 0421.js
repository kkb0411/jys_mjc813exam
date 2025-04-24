class Exam58 {
    strInput = "";
    constructor(input) {
        // Exam58 클래스의 비기본 생성자
        this.strInput = input.toString();
        // 매개변수 input 의 값을 멤버변수 strInput 으로 복사 했다.
    }
    solve() {
    }
}

function solveExam58() {
    let number = document.getElementById("exam58_01").value;
    let exam58 = new Exam58(number);    // exam58 객체 생성할때 비기본생성자
    let result = exam58.solve();    // exam58 객체의 solve 메소드 실행, 결과를 리턴
    document.getElementById("exam58result").innerText = result;
    // html 태그의 ID 가 exam58result 인 <div id="exam58result">결과</div>
}