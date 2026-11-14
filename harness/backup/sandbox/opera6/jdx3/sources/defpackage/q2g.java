package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.media3.ui.PlayerView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bookmarks.h;
import com.opera.android.downloads.SaveSheet;
import com.opera.android.favorites.e;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.CoroutineContext;
import org.chromium.base.ThreadUtils;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes.dex */
public final /* synthetic */ class q2g implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q2g(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte b = 5;
        byte b2 = 4;
        int i = 0;
        bp2 bp2Var = null;
        switch (this.a) {
            case 0:
                ((j12) this.c).run(Collections.unmodifiableList(((p2g) ((i32) this.b).l).a));
                return;
            case 1:
                ((j12) this.c).run(((p2g) ((i32) this.b).l).b);
                return;
            case 2:
                ((s9g) this.b).f.forEach(new pv1((List) this.c, b2));
                return;
            case 3:
                tjg tjgVar = (tjg) this.b;
                Runnable runnable = (Runnable) this.c;
                if (tjgVar.o != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                PlayerView playerView = (PlayerView) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                int i2 = PlayerView.C;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(playerView.getResources(), bitmap);
                ImageView imageView = playerView.f;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                    playerView.o();
                }
                gig gigVar = playerView.q;
                if (gigVar != null && gigVar.C(30) && gigVar.w().a(2)) {
                    return;
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                    playerView.o();
                }
                View view = playerView.c;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 5:
                tlg tlgVar = (tlg) this.b;
                ndc ndcVar = (ndc) this.c;
                if (tlgVar.l || ndcVar.getLifecycle().i == qcc.a) {
                    return;
                }
                tlgVar.l = true;
                ((e) tlgVar.a).f.F(tlgVar.j);
                tlgVar.S();
                return;
            case 6:
                ((ulg) this.b).e.run((String) this.c);
                return;
            case 7:
                ((rwg) this.b).a((buk) this.c);
                return;
            case 8:
                ((PreviewView) ((yhe) this.b).b).o.a((buk) this.c);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                s1h s1hVar = (s1h) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                xwh xwhVar = s1hVar.f;
                xug.i();
                if (xwhVar.f) {
                    return;
                }
                new koj(bp2Var, bitmap2, b);
                throw null;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                s1h s1hVar2 = (s1h) this.b;
                qya qyaVar = (qya) this.c;
                xwh xwhVar2 = s1hVar2.f;
                xug.i();
                if (xwhVar2.f) {
                    qyaVar.close();
                    return;
                }
                jpo.n("onImageCaptured() must be called before onFinalResult()", xwhVar2.b.b.isDone());
                xwhVar2.a();
                new cbl(bp2Var, qyaVar);
                throw null;
            case 11:
                s1h s1hVar3 = (s1h) this.b;
                gwa gwaVar = (gwa) this.c;
                xwh xwhVar3 = s1hVar3.f;
                xug.i();
                if (xwhVar3.f) {
                    return;
                }
                jpo.n("onImageCaptured() must be called before onFinalResult()", xwhVar3.b.b.isDone());
                xwhVar3.a();
                xug.i();
                new koj(bp2Var, gwaVar, b2);
                throw null;
            case 12:
                t1h t1hVar = (t1h) this.b;
                w4o w4oVar = (w4o) this.c;
                synchronized (t1hVar.k) {
                    ArrayList arrayList = t1hVar.j;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((dg8) obj).a(w4oVar, false);
                    }
                }
                return;
            case 13:
                ((g5h) this.b).s((twi) this.c);
                return;
            case 14:
                ProxyChangeListener.a((ProxyChangeListener) this.b, (Intent) this.c);
                return;
            case 15:
                ProxyChangeListener.ProxyReceiver proxyReceiver = (ProxyChangeListener.ProxyReceiver) this.b;
                Intent intent = (Intent) this.c;
                int i4 = ProxyChangeListener.ProxyReceiver.b;
                ProxyChangeListener.b(proxyReceiver.a, ProxyChangeListener.d(intent));
                return;
            case 16:
                tah tahVar = (tah) this.b;
                String str = (String) this.c;
                ((ImageView) tahVar.h).setVisibility(8);
                ((wmj) tahVar.i).setVisibility(0);
                wmj wmjVar = (wmj) tahVar.i;
                wmjVar.a = str;
                wmjVar.b = null;
                wmjVar.requestLayout();
                return;
            case 17:
                ivg ivgVar = (ivg) this.b;
                io7 io7Var = (io7) this.c;
                ArrayList arrayList2 = (ArrayList) ivgVar.c;
                EnumSet enumSet = (EnumSet) ivgVar.b;
                enumSet.remove(io7Var);
                if (enumSet.isEmpty()) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((Runnable) obj2).run();
                    }
                    arrayList2.clear();
                    return;
                }
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ych ychVar = (ych) this.b;
                na2.B(ychVar.b, (CoroutineContext) null, (rx5) null, new r8h((plh) this.c, ychVar, (mt5) null, (byte) 1), 3);
                return;
            case 19:
                glh glhVar = (glh) this.b;
                Collection<?> collection = (Collection) this.c;
                glhVar.g.removeAll(collection);
                h7f h7fVar = glhVar.b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((clh) g7fVarH.next()).c(collection);
                }
                return;
            case SizeUtil.textSize0 /* 20 */:
                glh glhVar2 = (glh) this.b;
                wzg wzgVar = (wzg) this.c;
                ArrayList arrayListM = glhVar2.a.m();
                glhVar2.i(arrayListM);
                wzgVar.c = arrayListM;
                ((CountDownLatch) wzgVar.b).countDown();
                return;
            case 21:
                glh glhVar3 = (glh) this.b;
                String str2 = (String) this.c;
                jlh jlhVar = glhVar3.a;
                Long lK = jlhVar.k(str2);
                if (lK != null) {
                    long jLongValue = lK.longValue();
                    SQLiteDatabase writableDatabase = jlhVar.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        writableDatabase.execSQL("UPDATE reading SET visit_count = visit_count + 1 WHERE id=?", new String[]{Long.toString(jLongValue)});
                        writableDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                s28 s28Var = (s28) this.b;
                Callback callback = (Callback) this.c;
                z0b z0bVar = new z0b(4);
                z0bVar.e((l76) s28Var.e);
                callback.run(z0bVar.g());
                return;
            case 23:
                s28 s28Var2 = (s28) this.b;
                ((l76) s28Var2.e).remove((String) this.c);
                s28Var2.d();
                return;
            case SizeUtil.textSize2 /* 24 */:
                ((b2j) this.b).execute((Runnable) this.c);
                return;
            case 25:
                x5f x5fVar = (x5f) this.b;
                h hVar = (h) this.c;
                int iB = hVar.b();
                hVar.o().c(new sa2((byte) 5, false));
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    b66 b66VarF = x56VarF.F(zpaVar);
                    b66VarF.p(43, 1, iB);
                    b66VarF.p(44, 1, i);
                    x5fVar.U0(x56VarF);
                    return;
                }
                return;
            case 26:
                ((dbh) this.b).E((Typeface) this.c);
                return;
            case 27:
                bei beiVar = (bei) this.b;
                String str3 = (String) this.c;
                if (str3 == null) {
                    ThreadUtils.d(new pjg(beiVar, (byte) 28));
                    return;
                } else {
                    he2.a(new aei(beiVar.b, str3, beiVar.a), new Void[0]);
                    return;
                }
            case 28:
                q9n.G(((iji) this.b).b.getContext(), (SaveSheet.FilenameEditText) this.c);
                return;
            default:
                vqi vqiVar = (vqi) this.b;
                s4f s4fVar = (s4f) this.c;
                vqiVar.getClass();
                s4fVar.invoke();
                return;
        }
    }
}
