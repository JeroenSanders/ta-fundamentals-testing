function doCalculation(operator, a, b) {
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

function isItWorkingTime() {
    const hours = (new Date()).getHours();
    return hours >= 10 && hours <= 12;
}

export default class LazyCalculator {

    forceCalculate(operator, a, b) {
        console.log(`I was forced to calculate ${a} ${operator} ${b} :'(`);
        return doCalculation(operator, a, b);
    }

    nicelyCalculate(operator, a, b) {
        if (!isItWorkingTime()) {
            throw new Error("I don't want to work right now!");
        }
        return doCalculation(operator, a, b);
    }
}
