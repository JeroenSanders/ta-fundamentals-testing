export default class GenericCalculator {

    calculate(operator, a, b) {
        switch(operator) {
            case '+':
                return (a + b) % 7;
            case '*':
                if (a === 0) return 0;
                return b + this.calculate('*', a - 1, b);
            default:
                return 42;
        }
    }
}
