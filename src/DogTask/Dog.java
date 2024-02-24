package DogTask;

class Dog {
    private String breed;
    private String size;
    private int age;
    private float weight = 5.0F;

    public Dog() {
    }

    public Dog(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    public Dog(String breed, String size, int age, float weight) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void getInfo() {
        System.out.println("breed:" + breed + ", size:" + size + ", age:" + age);
    }

    int eat(int carbohydrates, int proteins, int fats) {
        return carbohydrates * 4 + proteins * 4 + fats * 9;
    }

    String checkCalories(int calories) {
        float permittedCalories = (535 / 10) * weight;

        if (Math.abs((calories - permittedCalories)) < 30) {
            return "good";
        } else {
            return "bad";
        }
    }
}