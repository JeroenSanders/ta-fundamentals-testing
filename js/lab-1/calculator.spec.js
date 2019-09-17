import Calculator from './calculator';

describe('Calculator', () => {

    it('Example test: can add 1 and 2', () => {
        const calculator = new Calculator();
        const result = calculator.add(1, 2);
        expect(result).toBe(3);
    });

});

