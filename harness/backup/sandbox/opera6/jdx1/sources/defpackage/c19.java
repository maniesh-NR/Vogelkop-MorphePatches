package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class c19 extends a63 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) throws IOException {
        Uri uri = nd6Var.a;
        long j = nd6Var.e;
        this.f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = nd6Var.f;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new b19(null, null, 2008);
                }
                this.h = true;
                f(nd6Var);
                return this.g;
            } catch (IOException e) {
                throw new b19(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b19(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbN = z1m.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbN.append(fragment);
            throw new b19(sbN.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new b19(2006, e3);
        } catch (RuntimeException e4) {
            throw new b19(2000, e4);
        }
    }

    @Override // defpackage.ed6
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new b19(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
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
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = tym.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= i3;
                a(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new b19(2000, e);
        }
    }
}
