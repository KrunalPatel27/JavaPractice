abstract class Car {
    public description: string;
    public getDescrption(): string {
        return this.description;
    }
    public abstract cost(): number;
}

class ModelS extends Car {
    public description = "Model S";
    public cost(): number {
        return 73000;
    }
}
class ModelX extends Car {
    public description = "Model X";
    public cost(): number {
        return 77000;
    }
}
abstract class CarOptions extends Car {
    decoratedCar: Car;
    public abstract getDescrption(): string;
    public abstract cost();
}
class EnhancedAutoPilot extends CarOptions {
    constructor(car: Car) {
        super();
        this.decoratedCar = car;
    }
    public getDescrption(): string {
        return this.decoratedCar.getDescrption() + ', Enhanced AutoPilot'
    } public cost() {
        return this.decoratedCar.cost() + 5000;
    }
}

let myTesla = new ModelS();
myTesla = new EnhancedAutoPilot(myTesla);
console.log(myTesla.getDescrption());