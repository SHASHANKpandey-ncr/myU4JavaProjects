

const roll = document.querySelector('#roll');
roll.addEventListener('click',function(event){
    var arr=[]
    var win=['Member A','Member B','Member C']
    var mem1=Math.floor(Math.random() * 6) + 1
    var mem2=Math.floor(Math.random() * 6) + 1
    var mem3=Math.floor(Math.random() * 6) + 1

    // if(mem1 != mem2 && mem1 != mem3 && mem2 != mem3 )
    {document.querySelector('#member-1').innerText= mem1

    
    document.querySelector('#member-2').innerText= mem2

    
    document.querySelector('#member-3').innerText= mem3
    arr.push(mem1)
    arr.push(mem2)
    arr.push(mem3)
    var max=Math.max(...arr)
    var winner=win[arr.indexOf(max)]
    document.querySelector('#winner').innerText= winner}

    if(mem1>mem2&&mem1>mem3&&mem2>mem3)
    {
        document.querySelector('#member-1').style.backgroundColor='green'
        document.querySelector('#member-2').style.backgroundColor='yellow'
        document.querySelector('#member-3').style.backgroundColor='red'

    }
    else if(mem1>mem2&&mem1>mem3&&mem3>mem2)
    {
        document.querySelector('#member-1').style.backgroundColor='green'
        document.querySelector('#member-3').style.backgroundColor='yellow'
        document.querySelector('#member-2').style.backgroundColor='red'

    }
    else if(mem2>mem1&&mem2>mem3&&mem1>mem3)
    {
        document.querySelector('#member-2').style.backgroundColor='green'
        document.querySelector('#member-1').style.backgroundColor='yellow'
        document.querySelector('#member-3').style.backgroundColor='red'

    }
    else if(mem2>mem1&&mem2>mem3&&mem3>mem1)
    {
        document.querySelector('#member-2').style.backgroundColor='green'
        document.querySelector('#member-3').style.backgroundColor='yellow'
        document.querySelector('#member-1').style.backgroundColor='red'

    }
    else if(mem3>mem1&&mem3>mem2&&mem1>mem2)
    {
        document.querySelector('#member-3').style.backgroundColor='green'
        document.querySelector('#member-1').style.backgroundColor='yellow'
        document.querySelector('#member-2').style.backgroundColor='red'

    }
    else if(mem3>mem1&&mem3>mem2&&mem2>mem1)
    {
        document.querySelector('#member-3').style.backgroundColor='green'
        document.querySelector('#member-2').style.backgroundColor='yellow'
        document.querySelector('#member-1').style.backgroundColor='red'

    }
    else if(mem3>mem1&&mem3>mem2&&mem2===mem1)
    {
        document.querySelector('#member-3').style.backgroundColor='green'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='blue'
        document.querySelector('#winner').innerText= winner

    }
    else if(mem1>mem3&&mem1>mem2&&mem2===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='green'
        document.querySelector('#winner').innerText= winner

    }
    else if(mem2>mem3&&mem2>mem1&&mem1===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='green'
        document.querySelector('#winner').innerText= winner

    }
    else if(mem1>mem2&&mem1===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='red'
        document.querySelector('#winner').innerText= 'Draw'

    }
    else if(mem2>mem1&&mem2===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='red'
        document.querySelector('#winner').innerText= 'Draw'

    }
    else if(mem3>mem1&&mem2===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='red'
        document.querySelector('#winner').innerText= 'Draw'
    }
    else if(mem3===mem1&&mem2===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='blue'
        document.querySelector('#winner').innerText= 'Draw'

    }
    else if(mem3>mem2&&mem1===mem3)
    {
        document.querySelector('#member-3').style.backgroundColor='blue'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='red'
        document.querySelector('#winner').innerText= 'Draw'
    }
    else if(mem1>mem3&&mem1===mem2)
    {
        document.querySelector('#member-3').style.backgroundColor='red'
        document.querySelector('#member-2').style.backgroundColor='blue'
        document.querySelector('#member-1').style.backgroundColor='blue'
        document.querySelector('#winner').innerText= 'Draw'
    }
    



})
