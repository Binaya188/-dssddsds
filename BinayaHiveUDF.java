import org.apache.hadoop.hive.ql.exec.UDF;

public class BinayaHiveUDF extends UDF {
    //public static void main(String args[]) {
        public double evaluate ( double math, double eng, double physics, double social)
        {
            double maxMarks = math;
            if (eng > maxMarks) {
                maxMarks = eng;
            }
            if (physics > maxMarks) {
                maxMarks = physics;
            }
            if (social > maxMarks) {
                maxMarks = social;
            }
            return maxMarks;
        }
    }

