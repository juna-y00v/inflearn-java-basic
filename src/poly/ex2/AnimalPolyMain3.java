package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(),new Duck(),new Pig()};
        //Pig는 오버라이딩 하지않아서 Animal 클래스 sound가 등장함

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }


    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
