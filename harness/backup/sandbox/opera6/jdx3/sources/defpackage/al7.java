package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.google.android.gms.location.LocationServices;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.favorites.data.FavoriteRemovedSuggestionsDatabase_Impl;
import com.opera.android.tabui2.siteimages.ImageUrlRepDatabase_Impl;
import com.opera.android.webaiassistant.db.HistoryDatabase_Impl;
import com.opera.hype.image.editor.EditImage;
import com.opera.hype.image.editor.ImageEditorActivity;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final /* synthetic */ class al7 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ al7(zb7 zb7Var, r17 r17Var) {
        this.a = (byte) 4;
        this.b = zb7Var;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
    public final Object invoke() {
        int largeMemoryClass;
        int i = 2;
        byte b = 23;
        char c = 1;
        switch (this.a) {
            case 0:
                return new wk7((bl7) this.b, c == true ? 1 : 0);
            case 1:
                return ((EditImage) this.b).d;
            case 2:
                c82 c82Var = ((EmojiPickerView) this.b).i;
                if (c82Var != null) {
                    return c82Var;
                }
                return null;
            case 3:
                return zi4.A((Context) ((x77) this.b).b);
            case 4:
                ((zb7) this.b).invoke();
                return Boolean.TRUE;
            case 5:
                return new ur8((FavoriteRemovedSuggestionsDatabase_Impl) this.b);
            case 6:
                return (t9f) ((br6) ((ks3) this.b).e).b().get();
            case 7:
                File file = (File) this.b;
                synchronized (w19.e) {
                    w19.d.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case 8:
                a49 a49Var = (a49) this.b;
                int iS = a49Var.b.s(p6l.b);
                if (iS == 0 && a49Var.c > 0) {
                    a49Var.a.o = "";
                }
                a49Var.c = iS;
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((vg9) this.b).V0();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                c37 c37Var = (c37) this.b;
                b2l b2lVar = ((k6l) c37Var.a).o;
                ((MenuItem) c37Var.b).setEnabled(b2lVar != null && ((d7l) b2lVar).n());
                return Unit.a;
            case 11:
                return (LocationManager) ((Context) ((pad) this.b).b).getSystemService(LocationManager.class);
            case 12:
                yo9 yo9Var = (yo9) this.b;
                e04 e04Var = yo9Var.c;
                String str = yo9Var.b;
                xo9 xo9Var = (str == null || !yo9Var.d) ? new xo9(yo9Var.a, yo9Var.b, new eq6((byte) 16), e04Var, yo9Var.e) : new xo9(yo9Var.a, new File(yo9Var.a.getNoBackupFilesDir(), str).getAbsolutePath(), new eq6((byte) 16), e04Var, yo9Var.e);
                xo9Var.setWriteAheadLoggingEnabled(yo9Var.g);
                return xo9Var;
            case 13:
                up9 up9Var = (up9) this.b;
                g77 g77Var = new g77((byte) 20);
                g77Var.b = (pna) up9Var.b.get();
                String string = ((f3j) up9Var.a.get()).d.toString();
                if (!c.l(string, "/", false)) {
                    string = string.concat("/");
                }
                g77.d(g77Var, string);
                o95.s((LinkedHashSet) g77Var.c, new pw6[]{new pw6((byte) 2)});
                jyb jybVarF = g77Var.f();
                return new sfo(jybVarF.a, jybVarF.b, new qe6(jybVarF, b));
            case 14:
                return LocationServices.getFusedLocationProviderClient((Context) ((k5o) this.b).b);
            case 15:
                File file2 = (File) ((cw3) this.b).invoke();
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                return file2;
            case 16:
                return (ysj) ((cw3) this.b).invoke();
            case 17:
                ((d5a) this.b).b();
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                g5a g5aVar = (g5a) this.b;
                kol kolVar = g5aVar.c;
                b2l b2lVar2 = g5aVar.a;
                kolVar.j(new fol(((d7l) b2lVar2).j.getId(), b2lVar2.T(), ((d7l) b2lVar2).h0()));
                return Unit.a;
            case 19:
                int iOrdinal = ((h5a) this.b).a().ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        i = 4;
                        if (iOrdinal != 4) {
                            h9o.p();
                            return null;
                        }
                    }
                }
                return Integer.valueOf(i);
            case SizeUtil.textSize0 /* 20 */:
                ((v8a) this.b).b();
                return Unit.a;
            case 21:
                return new hba((dg5) this.b);
            case SizeUtil.textSize1 /* 22 */:
                return new qca((HistoryDatabase_Impl) this.b);
            case 23:
                return Http2Connection.p((Http2Connection) this.b);
            case SizeUtil.textSize2 /* 24 */:
                axa axaVar = (axa) this.b;
                int i2 = axa.i;
                ?? r7 = (ImageEditorActivity) axaVar.requireActivity();
                Intent intent = r7.getIntent();
                return new mxa((ImageEditorActivity) r7, intent != null ? intent.getExtras() : null, r7.getApplicationContext(), (Uri) r7.b.getValue(), (List) r7.a.getValue(), (ra5) r7.c.getValue());
            case 25:
                nxa nxaVar = (nxa) this.b;
                Context context = nxaVar.a;
                nxaVar.setDrawable(0, ui6.o(context));
                Drawable drawableU = w8h.u(2131231724, context);
                j14.n0(drawableU, j7h.k(2130969263, context));
                nxaVar.setDrawable(1, new w3a(drawableU, 17, false));
                nxaVar.invalidateSelf();
                return Unit.a;
            case 26:
                Context context2 = (Context) ((igi) this.b).b;
                double d = 0.2d;
                try {
                    if (((ActivityManager) context2.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    qp2.o("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                bp bpVar = new bp((byte) 23);
                try {
                    ActivityManager activityManager = (ActivityManager) context2.getSystemService(ActivityManager.class);
                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    largeMemoryClass = Constants.Crypt.KEY_LENGTH;
                }
                return new amh(new qq8((long) (d * (largeMemoryClass << 20)), bpVar), bpVar);
            case 27:
                return new e58((ImageUrlRepDatabase_Impl) this.b);
            case 28:
                ((o2b) this.b).g0();
                return Unit.a;
            default:
                p4b p4bVar = (p4b) this.b;
                ViewGroup viewGroup = p4bVar.d;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131558938, viewGroup, false);
                int i3 = 2131363846;
                TextView textView = (TextView) w1h.j(2131363846, constraintLayoutInflate);
                if (textView != null) {
                    i3 = 2131363847;
                    TextView textView2 = (TextView) w1h.j(2131363847, constraintLayoutInflate);
                    if (textView2 != null) {
                        return new a7n(constraintLayoutInflate, textView, textView2, p4bVar.f, p4bVar.e, p4bVar.g.c);
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
                return null;
        }
    }
}
