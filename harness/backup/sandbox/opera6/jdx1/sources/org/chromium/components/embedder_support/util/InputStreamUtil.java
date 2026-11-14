package org.chromium.components.embedder_support.util;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class InputStreamUtil {
    public static int available(InputStream inputStream) {
        try {
            return Math.max(-1, inputStream.available());
        } catch (IOException unused) {
            return -2;
        }
    }

    public static void close(InputStream inputStream) throws IOException {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return Math.max(-1, inputStream.read(bArr, i, i2));
        } catch (IOException unused) {
            return -2;
        }
    }

    public static long skip(InputStream inputStream, long j) {
        try {
            return Math.max(-1L, inputStream.skip(j));
        } catch (IOException unused) {
            return -2L;
        }
    }
}
