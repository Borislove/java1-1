package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    @Override
    public String toString() {
        return "I am" + getKind() + ", eat" + getFoodKind();

    }

    public double calculateFoodWeight() {
        return weight / getFoodCoeff();
    }

    public String toStringFull() {
        return "I am" + getKind() + ", eat" + getFoodKind() + calculateFoodWeight();
    }

    public class Cow extends Animal {

        public Cow(double weight) {
            super(weight);
        }

        @Override
        public AnimalKind getKind() {
            return AnimalKind.COW;
        }

        @Override
        public FoodKind getFoodKind() {
            return FoodKind.HAY;
        }

        @Override
        public double getFoodCoeff() {
            return 0.05;
        }

    }

    public class Hamster extends Animal {
        public Hamster(double weight) {
            super(weight);
        }

        @Override
        public AnimalKind getKind() {
            return AnimalKind.HAMSTER;
        }

        @Override
        public FoodKind getFoodKind() {
            return FoodKind.CORN;
        }

        @Override
        public double getFoodCoeff() {
            return 0.03;
        }
    }

    public class Duck extends Animal {
        public Duck(double weight) {
            super(weight);
        }

        @Override
        public AnimalKind getKind() {
            return AnimalKind.DUCK;
        }

        @Override
        public FoodKind getFoodKind() {
            return FoodKind.CORN;
        }

        @Override
        public double getFoodCoeff() {
            return 0.04;
        }
    }


}
