function Fire(){
    let varsen = prompt("Введите любимый фильм")
    if (varsen == "Экивоки"){
        alert("да, это мой фильм")
    } else {
        alert("попробуй ещй раз")
    }
            
}

// console.log(Fire(10, 5))
document.querySelector("h1").style.color = "#FF1493"
//document.getElementById("bg").style.color = "Red"
let nuevo = document.getElementsByClassName("bgn")
nuevo[0].style.backgroundColor = "#98FB98"
// document.write(Fire(10, 5))
console.log(nuevo)

let arrasdaw = [1,2,3,4,5,6]

arrasdaw[0] += 5
arrasdaw[1] += 6
arrasdaw[5] += 7
arrasdaw.push(8)
arrasdaw[0]++ 
console.log(arrasdaw)

    

