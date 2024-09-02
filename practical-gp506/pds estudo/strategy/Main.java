package strategy;


public class Main {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor(new AddOperation());
        int result = processor.performOperation(5, 3);
        System.out.println("5 + 3 = " + result);
        
        processor.setOperation(new SubtractOperation());
        result = processor.performOperation(10, 4);
        System.out.println("10 - 4 = " + result);
        
        processor.setOperation(new MultiplyOperation());
        result = processor.performOperation(5, 3);
        System.out.println("5 x 3 = " + result);
        processor.setOperation(new DivideOperation());
        result = processor.performOperation(10, 2);
        System.out.println("10 / 2 = " + result);
    }

    interface Operation {
        int perform(int a, int b);
    }

    static class NumberProcessor {
        private Operation operation;
    
        public NumberProcessor(Operation operation) {
            this.operation = operation;
        }
    
        public int performOperation(int a, int b) {
            return operation.perform(a, b);
        }
    
        public void setOperation(Operation operation) {
            this.operation = operation;
        }
    }

    static class AddOperation implements Operation {
        public int perform(int a, int b) {
            return a + b;
        }
    }

    static class SubtractOperation implements Operation{

        public int perform(int a, int b) {
            return a - b;
        }
    }

    static public class MultiplyOperation implements Operation {

        public int perform(int a, int b) {
            return a * b;
        }
    }

    static public class DivideOperation implements Operation {

        public int perform(int a, int b) {
            return a / b;
        }
    }
    

    
    
    
}

