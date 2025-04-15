pdfExam10(){
    console.log("    *");
    console.log("   ***");
    console.log("  *****");
    console.log(" *******");
    console.log("*********");
    let nSpace = 4;
    let nStar = 1;
    for(let nline = 0; nline<5; nline++){
        let strLine = "";
        for(let nSp = 0; nSp < nSpace; nSp++){
            strLine += " ";
        }
        for(let nSt = 0; nSt < nStar; nSt++){
            strLine += "*";
        }
        console.log(strLine);
        nSpace--;
        nStar += 2;
    }
}
let pdfExam10 = new pdfExam10();
