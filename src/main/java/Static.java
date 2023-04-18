public class Static
    {
        private static int instanceCount = 0;

        public Static()
        {
            instanceCount++;
        }

        public static int getInstanceCount()
        {
            return instanceCount;
        }

        public static void main(String[] args)
        {
            Static obj1 = new Static();
            Static obj2 = new Static();
            Static obj3 = new Static();

            System.out.println("Number of instances created: " + Static.getInstanceCount());
        }
    }

