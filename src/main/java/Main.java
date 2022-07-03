import frame.KabupatenViewFrame;
import frame.KecamatanViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
       // Koneksi.getConnection();
        // KabupatenViewFrame viewFrame = new KabupatenViewFrame();
        KecamatanViewFrame viewFrame = new KecamatanViewFrame();
        viewFrame.setVisible(true);
    }

}
