JAVA sTRING METHODS

1.toUpperCase()      ---ABHISHEK
2.toLowerCase()      --abhishek
3.trim()             --remove spaces
4.startsWith()      System.out.print("Carpet".startsWith("Car"))----true
5.endsWith()        System.out.print("Carpet".startsWith("pet"))--true
6.equal()           System.out.print("Carpet".equal("Car")) --false
7.equalslgnoreCase()   
8.charAt()           charAt()---position of character indix
9.valueOf()     --integer converted into string  
10.replace()
11.contains()
12.substring()    --sentence.substring(2,5) from 2 to 4
13.split()
14.toCharArray()
15.isEmpty()


        valueOf[ 
         int age=123;
        String stringAge =String.valueOf(age);  ----converted into string
        System.out.print(age+2) //125
        System.out.print(stringAge+2) //1232   ]   
        

        replace[
                String sentence="I love java, java is a good language";
                String newSentence = sentence.replace("java","pythone")
        ]


        split[
                String sentence ="I love java, Java is a good language";
                String word[]=sentence.split(" ")  --if we fil space, all the separation on the base of space
                if we fill "," all word separation base on comma      ]