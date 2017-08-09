import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 *
 * @author Tom Lee  2017-05-17-上午11:32
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        doGenerate();

    }

    /**
     * @throws Exception
     */
    public static void doGenerate() throws Exception {
        List<String> lo = new ArrayList<>();
        List<String> l = new ArrayList<>();


        //简单笔画的字
       /* try (BufferedReader br = new BufferedReader(new InputStreamReader( Generator.class.getResourceAsStream("less.txt"), "UTF-8"))) {

            String line;

            while ((line = br.readLine()) != null) {
                lo.add(line);
            }
        }*/
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Generator.class.getResourceAsStream("more.txt"), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] k = line.split(" ");
                //2500-> 字的使用频率权重
                if (Integer.parseInt(k[1]) > 2500) {
                    l.add(k[0]);
                }
            }
        }
        pringName(l, lo);

    }

    private static void pringName(List<String> l, List<String> lo) throws InterruptedException {
        for (int i = 0; i < l.size(); i++) {
            int i1 = new Random().nextInt(l.size() - 1);
            int i2 = new Random().nextInt(l.size() - 1);
            Thread.sleep(500);
            System.out.println(l.get(i1) + l.get(i2));

        }
    }
}
