package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class cb2 extends a63 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public cb2(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) throws IOException {
        try {
            Uri uri = nd6Var.a;
            long j = nd6Var.e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new bb2(2008, null);
            }
            long j2 = nd6Var.f;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            f(nd6Var);
            return this.h;
        } catch (bb2 e) {
            throw e;
        } catch (IOException e2) {
            throw new bb2(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.ed6
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new bb2(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new bb2(2000, e);
                }
            }
            InputStream inputStream = this.g;
            String str = tym.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - i3;
                }
                a(i3);
                return i3;
            }
        }
        return -1;
    }
}
