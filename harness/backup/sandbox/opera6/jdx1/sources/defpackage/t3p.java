package defpackage;

import ads_mobile_sdk.bj1;
import android.content.pm.ApkChecksum;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class t3p implements g94, cdp {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ ApkChecksum b(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ void c() throws elo {
        throw new elo();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public static void d(int i) throws o2j {
        throw new amm(sko.i(i, "An unknown field for index "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Failed writing ");
        sb.append((char) i2);
        sb.append((Object) " at index ");
        sb.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void g(int i, Object obj) {
        throw new RuntimeException("Unexpected output size of " + obj + ((Object) " digest: ") + i);
    }

    public static /* synthetic */ void h(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str) throws bj1 {
        throw new bj1(str);
    }

    public static /* synthetic */ void k(String str, Throwable th) throws GeneralSecurityException {
        throw new GeneralSecurityException(str, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void o() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void p(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void r(Throwable th) throws IOException {
        throw new IOException(th);
    }

    public static /* synthetic */ void t() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void u(String str) {
        throw new SecurityException(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public static /* synthetic */ void v() throws pxb {
        throw new pxb();
    }

    public static /* synthetic */ void w(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void x() {
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ void y() {
        throw new NoSuchElementException();
    }

    public final void l(Object obj) {
        gxo.a(new ttn((qio) obj, (byte) 23));
    }

    @Override // defpackage.cdp
    public final Object s(pzh pzhVar) {
        switch (this.a) {
            case 17:
                return Unit.a;
            default:
                return pzhVar.g.string();
        }
    }
}
