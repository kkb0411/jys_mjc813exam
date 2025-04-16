
//17번 문제
//class h {
//    height = 0;
//
//    check() {
//        this.height = prompt("입력하세요");
//        if ( Number(this.height) >= 150 ) {
//            console.log("YES");
//        } else {
//            console.log("NO");
//        }
//    }
//}
//
//let l = new h();
//l.check();

//문제 18
//class average{
//    constructor(lan,math,eng){
//        this.lan = lan;
//        this.math = math;
//        this.eng = eng;
//    }
//}

//문제 19번
class Sqrt{
    constructor(a,b){
        this.a=a;
        this.b=b;
    }
    check(){
        console.log(Math.pow(this.a,this.b));
    }

}
let sq = new Sqrt(10,3);
sq.check();




//문제 25번
//문제 26번
//19,26,25