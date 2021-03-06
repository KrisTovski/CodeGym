package com.codegym.task.task24.task2407;

/*
At times, you'll need to cast a class to some interface (CanSpeak, in this case)
that isn't implemented in the current class
 */
public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    /**
     * This is a way to adapt to a different interface (CanSpeak)
     * Inside the toCanSpeak method, create a CatPet class that implements the CanSpeak interface
     * The method's logic is this:
     * If i < 1, then display a message indicating that the cat is sleeping. For example, "Oscar is sleeping."
     * Otherwise, display: "<cat name> says meow!". For example, i=3, "Oscar says meooow!"
     * <p/>
     * <b>Example output:</b>
     * Smokey is sleeping.
     * Oscar says meoow!
     * Kitty says meooooow!
     * The mouse squeaks.
     * Tom says meow!
     * <p/>
     * @param i the number of o's to use in "meow"
     * @return an instance of the CatPet class
     */
    public CanSpeak toCanSpeak(final int i) {

        class CatPet implements CanSpeak{

            @Override
            public String speak() {
                String result = null;
                if(i<1){
                    result=  Cat.this.name+" is sleeping.";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for(int j=0; j<i;j++){
                        sb.append("o");

                        result = Cat.this.name + " says me" + sb + "w!";
                    }

                }


                return result;
            }
        }

        return new CatPet();
    }
}