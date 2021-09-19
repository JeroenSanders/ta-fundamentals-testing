export default class Calculator {

    add(a, b) {
        return (a + b) % 7;
    }

    multiply(a, b) {
        if (a === 0) return 0;

        return b + this.multiply(a - 1, b);
    }
}

