package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class xx7 {
    public static final Object j = new Object();
    public static volatile xx7 k;
    public final ReentrantReadWriteLock a;
    public final t72 b;
    public volatile byte c;
    public final sx7 d;
    public final wx7 e;
    public final r16 f;
    public final boolean g;
    public final boolean h;
    public final mq6 i;

    public xx7(tx7 tx7Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        this.g = tx7Var.a;
        this.e = (wx7) tx7Var.c;
        boolean z = tx7Var.b;
        this.h = z;
        this.i = (mq6) tx7Var.d;
        this.b = new t72(0);
        this.f = new r16();
        sx7 sx7Var = new sx7(this);
        this.d = sx7Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            sx7Var.a();
        }
    }

    public static xx7 a() {
        xx7 xx7Var;
        synchronized (j) {
            xx7Var = k;
            jpo.n("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", xx7Var != null);
        }
        return xx7Var;
    }

    public static void d(tx7 tx7Var) {
        if (k == null) {
            synchronized (j) {
                if (k == null) {
                    k = new xx7(tx7Var);
                }
            }
        }
    }

    public static boolean e() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        jpo.n("Not initialized yet", f());
        jpo.m(charSequence, "charSequence cannot be null");
        sx7 sx7Var = this.d;
        if (sx7Var.d) {
            return -1;
        }
        g77 g77Var = sx7Var.a;
        g77Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            cz7[] cz7VarArr = (cz7[]) spanned.getSpans(i, i + 1, cz7.class);
            if (cz7VarArr.length > 0) {
                return spanned.getSpanStart(cz7VarArr[0]);
            }
        }
        yy7 yy7Var = (yy7) g77Var.z(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, 1, i, null, null);
        if (yy7Var != null) {
            return yy7Var.a;
        }
        return -1;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final boolean f() {
        return c() == 1;
    }

    public final void g() {
        jpo.n("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h);
        if (f()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            this.d.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void h(Throwable th) {
        t72 t72Var = this.b;
        ArrayList arrayList = new ArrayList(t72Var.c);
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(t72Var);
            t72Var.clear();
            this.a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                vx7 vx7Var = (vx7) arrayList.get(i);
                vx7Var.b.execute(new ux7(vx7Var, th));
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void i() {
        t72 t72Var = this.b;
        ArrayList arrayList = new ArrayList(t72Var.c);
        this.a.writeLock().lock();
        try {
            this.c = (byte) 1;
            arrayList.addAll(t72Var);
            t72Var.clear();
            this.a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                vx7 vx7Var = (vx7) arrayList.get(i);
                vx7Var.b.execute(new ux7(vx7Var));
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e4, code lost:
    
        if (r10 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (r10 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        ((defpackage.dxj) r14).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        return r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:36:0x0067, B:44:0x0092, B:46:0x009c, B:48:0x009f, B:50:0x00a2, B:52:0x00b2, B:53:0x00b5, B:56:0x00c4, B:58:0x00ca, B:60:0x00d9, B:34:0x0063, B:37:0x0070, B:39:0x0074, B:41:0x0081), top: B:79:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence j(int r11, int r12, int r13, java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx7.j(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final CharSequence k(CharSequence charSequence) {
        return j(0, charSequence == null ? 0 : charSequence.length(), 0, charSequence);
    }

    public final void l(wxe wxeVar) {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        Objects.requireNonNull(handlerCreateAsync);
        jj5 jj5Var = new jj5(handlerCreateAsync, (byte) 0);
        jpo.m(wxeVar, "initCallback cannot be null");
        vx7 vx7Var = new vx7();
        vx7Var.a = wxeVar;
        vx7Var.b = jj5Var;
        this.a.writeLock().lock();
        try {
            if (this.c == 1) {
                jj5Var.execute(new ux7(vx7Var));
            } else if (this.c == 2) {
                jj5Var.execute(new ux7(vx7Var, new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.")));
            } else {
                this.b.add(vx7Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void m(EditorInfo editorInfo) {
        if (!f() || editorInfo == null) {
            return;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = new Bundle();
            editorInfo.extras = bundle;
        }
        sx7 sx7Var = this.d;
        if (sx7Var.d) {
            return;
        }
        wxd wxdVar = (wxd) sx7Var.b.c;
        int iA = wxdVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) ((t9d) wxdVar).d).getInt(iA + ((t9d) wxdVar).a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", sx7Var.c.g);
    }
}
