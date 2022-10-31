package hwFrom10.hw22coderDecoder;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeCoder extends FilterInputStream {
    private String key;

    protected DeCoder(InputStream in, String key) {
        super(in);
        this.key = key;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int res = super.read(b);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^ key.getBytes()[i % key.getBytes().length]);

        }
        return super.read(b);
    }
}
