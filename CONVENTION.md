Team Convention G.9

1.	Dot notation สามจุดขึ้นไปเคาะตั้งแต่จุดที่สอง

    ex.
    
    ~~~java
    @Override
    public String walk() {
        String aDuckWalks = "A duck".concat(" walks")
                .concat(" in the park")
                .concat(".");
        return aDuckWalks;
    }
    ~~~

2.	เคาะเว้นบรรทัดแยกเป็นกลุ่ม เช่น กลุ่มของตัวแปร, กลุ่ม loop
และเคาะเว้นแต่ละ method

    ex.
    
    ~~~java
    @Override
    public void quack(int amount) {
        String duck = "Duck ";
        String quack = "Quack";

        for(int i = 0; i <= amount; i++){
            System.out.println(duck + quack);
        }
    }
    ~~~
    
3.	ใช้ AutoFormat ในโปรแกรม(Intellij IDEA)จัดความเรียบร้อยของ Code 
(พวก whitespace ในแต่ละแถว)
4.	Statement ยาว ๆ เคาะเมื่อเกิน ~100 ตัวอักษร เคาะหลัง And &&, Or ||
5.	ใส่ปีกกาทุกครั้งเมื่อใช้ if ยกเว้นกรณีที่ ทั้ง condition มีบรรทัดเดียวให้รวบเป็นบรรทัดเดียวได้และไม่ต้องใส่ปีกกา

    ex.
	
    ~~~java
    @Override
    public void quack(int amount) {
        String duck = "Duck ";
        String quack = "Quack";

        if(amount == 1) System.out.println("Duck quack!");
        else {
            for (int i = 0; i <= amount; i++) {
                System.out.println(duck + quack);
            }
        }
    }
    ~~~

6.	ตั้งชื่อตัวแปรแบบ Lower Camel Case, ชื่อ Class ใช้ Upper Camel Case

    ex.
	
    ~~~java
    public class Main {
	    private Human mHuman;
	    public MySweetPizza mySweetPizza;
    }
    ~~~

7.	ชื่อ Package เป็นพิมพ์เล็ก เช่น menu
8.	ชื่อตัวแปรที่เป็น Array list ต้องมี s

	  ex.

    ~~~java
    public class Main {
	    private ArrayList<Animal> mAnimals;
    }
    ~~~
    
9.  Field naming
    * Non-public, non-static field names start with m.
    * Static field names start with s.
    * Other fields start with a lower case letter.
    * Public static final fields (constants) are ALL_CAPS_WITH_UNDERSCORES
    
    ex.
    
    ~~~java
    public class Main {
        public static final int SOME_CONSTANT = 42;
        public int publicField;
        private static Main sSingleton;
        int mPackagePrivate;
        private int mPrivate;
        protected int mProtected;
    }
    ~~~
    
10. ถ้าตัวแปรชื่อซ้ำให้เริ่มด้วยเลข 0 ต่อท้ายเสมอจากนั้นจะเพิ่มขึ้นทีละ 1

    ex.

    ~~~java
    public class Main {
        private int mNumber0
        private int mNumber1
        private int mNumber2
        private int mNumber3
    }
    ~~~

11. ปีกกา (เช่นของ if, function, class) ให้ปีกกาเริ่มต้นอยู่ในบรรทัดเดียวกันกับบรรทัดเริ่มต้น

    ex.
    
    ~~~java
    public void sit() {
        System.out.println("Human sit");
    }
    ~~~

12. สำหรับการ Indent ใช้การเว้น 4 Space
13. มีการเขียน comment อธิบายในแต่ละ class และ method ว่ามีหลักการทำงานหลัก ๆ อย่างไร
14. ต้อง Refactor code ทุกครั้งหลังทำเสร็จ

