//class h{
//    let height = 0;
//
//    if(height>=150){
//        console.log("YES");
//    }
//    else{
//        console.log("NO");
//    }
//}


class h {
    height = 0;

    check() {
        this.height = prompt("입력하세요");
        if ( Number(this.height) >= 150 ) {
            console.log("YES");
        } else {
            console.log("NO");
        }
    }
}

let l = new h();
l.check();