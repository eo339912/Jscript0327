        var num = 1;
        //변수값이 null, 0 -> 거짓(false)
        //변수값이 있거나, "값" -> 참(true)
        function gallary(direct){
            if(direct){//증가 -> 1 다음
                if(num==5){
                    num = 0 
                }
                    
                num++;
            }else{//감소 -> 0 이전
                if(num==1){
                    num = 6 
                }
                num--;
            }
            var photo = document.getElementById('photo');
            photo.setAttribute("src", "../images/img_" + num +".jpg")
            console.log(photo)
        }
        //var photo2 = document.getElementById('photo');
        //console.log(photo2) //console창에 null발생
