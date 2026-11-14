package defpackage;

import ads_mobile_sdk.gh3;
import ads_mobile_sdk.hh3;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class f30 extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ f30(byte b) {
        this.a = b;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) h38.b.a.s("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    h9o.o(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) h38.b.a.s("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    h9o.o(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) h38.b.a.s("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    h9o.o(e3);
                    return null;
                }
            case 3:
                try {
                    Cipher cipher = (Cipher) h38.b.a.s("AES/GCM-SIV/NoPadding");
                    if (k40.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e4) {
                    h9o.o(e4);
                    return null;
                }
            case 4:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    ob1 ob1Var = new ob1(choreographer, Handler.createAsync(looperMyLooper));
                    return e.a(ob1Var, ob1Var.k);
                }
                qp2.n("no Looper on this thread");
                return null;
            case 5:
                return new ayl();
            case 6:
                return new StringBuilder("Picasso-");
            case 7:
                return new ConcurrentLinkedQueue();
            case 8:
                return Boolean.FALSE;
            case 9:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 10:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 11:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 12:
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
            case 13:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return x7d.l();
                }
                if (Looper.myLooper() != null) {
                    return new g7a(new Handler(Looper.myLooper()));
                }
                return null;
            case 14:
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.US);
            case 15:
                return new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
            case 16:
                try {
                    return (Cipher) h38.b.a.s("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e5) {
                    h9o.o(e5);
                    return null;
                }
            case 17:
                Provider providerN = jpo.N();
                if (providerN != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerN);
                    } catch (GeneralSecurityException unused) {
                    }
                } else {
                    try {
                        provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (Throwable unused2) {
                    }
                    if (provider != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                        } catch (GeneralSecurityException unused3) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 18:
                return new PathMeasure();
            case 19:
                return new Path();
            case 20:
                return new Path();
            case 21:
                return new float[4];
            default:
                WeakHashMap weakHashMap = hh3.a;
                gh3 gh3Var = new gh3(SystemClock.currentThreadTimeMillis());
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap2 = hh3.a;
                synchronized (weakHashMap2) {
                }
                return gh3Var;
        }
    }
}
