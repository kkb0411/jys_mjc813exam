function solveExam40() {
    let totalWeight = document.getElementById("exam40_01").value;
    // html 태그에서 id="exam40_01" 인 value 속성을 가져온다.
    let countFriends = document.getElementById("exam40_02").value;
    // html 태그에서 id="exam40_02" 인 value 속성을 가져온다.
    let strFriendWeights = document.getElementById("exam40_03").value;
    // html 태그에서 id="exam40_03" 인 value 속성을 가져온다.
    if ( checkValidInputExam40(totalWeight, countFriends, strFriendWeights) ) {
        // checkValidInputExam40 함수가 참이면 실행한다.
        let exam40 = new Exam40(totalWeight, countFriends, strFriendWeights);
        let result = exam40.solve();
        document.getElementById("exam40result").innerText = result;
    }
}

function checkValidInputExam40(totalWeight, countFriends, strFriendWeights) {
    if ( totalWeight <= 0 || totalWeight >= 1001) {
        alert("놀이기구 무게는 1 ~ 1000까지 입력하세요.");
        return false;
    }
    let arr = strFriendWeights.split(" ");
    if ( countFriends != arr.length ) {
        alert("친구들의 숫자와 입력한 친구들의 몸무게 갯수가 다릅니다.");
        return false;
    }
    return true;
}

class Exam40 {
    totalWeight = 0;
    countFriends = 0;
    arrFriendWeights = [];

    constructor(tw, cf, strAfw) {
    // new Exam40(a, b, c);
    // Exam40 클래스를 인스턴스객체로 생성하는 비 기본생성자
        this.totalWeight = Number(tw);
        this.countFriends = Number(cf);
        this.arrFriendWeights = strAfw.split(" ").map((n) => Number(n));
        // Array.map( (매개변수) => Number(매개변수) );
        // => 배열의 모든원소를 숫자로 변환하여 새로운 배열을 리턴한다.
    }

    solve() {
        let i;
        let result = 0;
        for( i = 0; i < this.arrFriendWeights.length; i++ ) {
            if (this.totalWeight < result + this.arrFriendWeights[i]) {
                // 전체무게 < 이전원소까지 합산된 무게 + 현재원소의 무게
                break;   // 몇번째 원소 인지 리턴한다.
            }
            result += this.arrFriendWeights[i]; // 무게를 합산한다.
        }
        return i;
    }
}


function solveExam41() {
    let number = document.getElementById("exam41_01").value;
    // html 태그에서 id="exam41_01" 인 value 속성을 가져온다.
    if ( ...... ) {
        // checkValidInputExam41 함수가 참이면 실행한다.
        let exam41 = new Exam41(number);
        let result = exam41.solve();
        document.getElementById("exam41result").innerText = result;
    }
}

function checkValidInputExam41(number) {
    if ( number <= 2 ) {
        alert("숫자는 2 이상 입력하세요.");
        return false;
    }
    return true;
}

class Exam41 {
    number = 0;
    countFriends = 0;
    arrFriendWeights = [];

    constructor(number) {
    // new Exam41(a);
    // Exam41 클래스를 인스턴스객체로 생성하는 비 기본생성자
        this.number = Number(number);
    }

    solve() {
        for( ...... ) {
            // this.number 를 하나씩 뺀 값을 이용하여
            // this.number % this.number - 1 === 0 ===> 나머지가 0이면 소수가 아님
            // this.number % this.number - 2 === 0 ===> 나머지가 0이면 소수가 아님
            // this.number % this.number - 3 === 0 ===> 나머지가 0이면 소수가 아님
            // this.number % 2 === 0    ===> 2 까지 수행해본다.
        }
    }
}

function solveExam42() {
    let year = document.getElementById("exam42_01").value;
    let month = document.getElementById("exam42_02").value;
    let date = document.getElementById("exam42_03").value;
    if ( checkValidInputExam42(year, month, date) ) {
        let selectDay = new Date(year, month - 1, date);
        let arrDay = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
        document.getElementById("exam42result").innerText = arrDay[selectDay.getDay()];
    }
}

function checkValidInputExam42(year, month, date) {
    if ( year <= 0 || year >= 3000 ) {
        alert("년도는 1~2999년 으로 입력하세요.");
        return false;
    }
    if ( month <= 0 || month >= 13 ) {
        alert("월은 1~12 으로 입력하세요.");
        return false;
    }
    if ( date <= 0 || date >= 32 ) {
        alert("일은 1~31 으로 입력하세요.");
        return false;
    }
    return true;
}
}

class Exam53 {
    strMessage = "";
    constructor(msg) {
        this.strMessage = msg;
    }
    solve() {
        let mapBracket = new Map();
        for( let i = 0; i < this.strMessage.length; i++ ) {
            if( this.strMessage[i] == ")"
              || this.strMessage[i] == "}"
              || this.strMessage[i] == "]" ) {
                if ( !mapBracket.has(this.strMessage[i]) ) {
                    return "NO";
                } else {
                    mapBracket.set(this.strMessage[i], mapBracket.get(this.strMessage[i]) - 1);
                    // 닫는괄호를 만나면 ), }, ] 키에 해당하는 값을 -1 시킨다.
                }
            } else if ( this.strMessage[i] == "(" ) {
                // 여는괄호 ( 를 만나면 map.set(")", +1);
                //mapBracket.set(")", getNumber(mapBracket.get(")")) + 1);
                mapBracket.set(")", (mapBracket.has(")") ? mapBracket.get(")") : 0) + 1);
            } else if ( this.strMessage[i] == "{" ) {
                // 여는괄호 { 를 만나면 map.set("}", +1);
//                mapBracket.set("}", getNumber(mapBracket.get("}")) + 1);
                mapBracket.set("}", (mapBracket.has("}") ? mapBracket.get("}") : 0) + 1);
            } else if ( this.strMessage[i] == "[" ) {
                // 여는괄호 [ 를 만나면 map.set("]", +1);
//                mapBracket.set("]", getNumber(mapBracket.get("]")) + 1);
                mapBracket.set("]", (mapBracket.has("]") ? mapBracket.get("]") : 0) + 1);
            }
        }
        if (getNumber(mapBracket.get(")")) == 0
          && getNumber(mapBracket.get("}")) == 0
          && getNumber(mapBracket.get("]")) == 0) {
          // map.get(")") == 0 이면 ()() 완료
          // map.get("}") == 0 이면 {}{{}} 완료
          // map.get("]") == 0 이면 [[[]]] 완료
            return "YES";
        } else {
            return "NO";
        }
    }
}




