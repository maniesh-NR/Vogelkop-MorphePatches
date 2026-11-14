package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.settings.settings_search.database.SettingsSearchDatabase;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements m9n, xo4, yk7, fjc, op5, od3, n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g00(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ g00(ltl ltlVar, int i, CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = (byte) 8;
        this.b = i;
        this.c = collapsingToolbarLayout;
    }

    public final void a(boolean z) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.c;
        if (collapsingToolbarLayout != null) {
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
            layoutParams.height = z ? -2 : this.b;
            collapsingToolbarLayout.setLayoutParams(layoutParams);
            boolean z2 = !z;
            if (z2 != collapsingToolbarLayout.n) {
                collapsingToolbarLayout.n = z2;
                collapsingToolbarLayout.setContentDescription(!z ? collapsingToolbarLayout.l.H : null);
                collapsingToolbarLayout.g();
                collapsingToolbarLayout.requestLayout();
            }
        }
    }

    public final void accept(Object obj) {
        xbc xbcVar;
        xbc xbcVar2;
        nod nodVar = (nod) this.c;
        int i = this.b;
        try {
            try {
                xbcVar2 = (xbc) ((ListenableFuture) obj).get();
                z4o.D(xbcVar2, "LibraryResult must not be null");
            } catch (InterruptedException | ExecutionException e) {
                w7d.L("Library operation failed", e);
                String str = xbc.g;
                a4j a4jVar = new a4j("no error message provided", -1, Bundle.EMPTY);
                xbcVar = new xbc(a4jVar.a, SystemClock.elapsedRealtime(), (sjd) null, a4jVar, (Object) null, 4);
                xbcVar2 = xbcVar;
                mod modVar = nodVar.d;
                modVar.getClass();
                modVar.g(i, xbcVar2);
            } catch (CancellationException e2) {
                w7d.L("Library operation cancelled", e2);
                String str2 = xbc.g;
                a4j a4jVar2 = new a4j("no error message provided", 1, Bundle.EMPTY);
                xbcVar = new xbc(a4jVar2.a, SystemClock.elapsedRealtime(), (sjd) null, a4jVar2, (Object) null, 4);
                xbcVar2 = xbcVar;
                mod modVar2 = nodVar.d;
                modVar2.getClass();
                modVar2.g(i, xbcVar2);
            }
            mod modVar22 = nodVar.d;
            modVar22.getClass();
            modVar22.g(i, xbcVar2);
        } catch (RemoteException e3) {
            w7d.L("Failed to send result to browser " + nodVar, e3);
        }
    }

    @Override // defpackage.od3
    public final void c(Integer num, qjd qjdVar) {
        okg okgVar = (okg) this.c;
        egd egdVarC = okgVar.c(qjdVar);
        if (egdVarC != null) {
            if (this.b == egdVarC.e) {
                okgVar.c.remove(num.intValue());
                okgVar.b.b();
            }
        }
    }

    @Override // defpackage.yk7
    public final Drawable f() {
        Drawable drawableF = sgb.F(this.b, (Context) this.c);
        Objects.requireNonNull(drawableF);
        return drawableF;
    }

    public final Object g(Object obj) {
        boolean z;
        o9j o9jVar = (o9j) this.c;
        a21 a21Var = o9jVar.c;
        SettingsSearchDatabase settingsSearchDatabase = (SettingsSearchDatabase) a21Var.b;
        pmh pmhVarX = settingsSearchDatabase.x();
        ((i06) a21Var.c).getClass();
        kfo.Y(pmhVarX.a, false, true, new vvf(pmhVarX, new omh(this.b, System.currentTimeMillis()), (byte) 9));
        kfo.Y(settingsSearchDatabase.x().a, false, true, new u4h((byte) 8));
        j9j j9jVar = (j9j) o9jVar.f.g();
        if (j9jVar != null && (z = j9jVar.c) && (!z || !j9jVar.b.isEmpty())) {
            o9j.h(o9jVar, null, 3);
        }
        return Unit.a;
    }

    public final void invoke(Object obj) {
        eig eigVar = (eig) obj;
        eigVar.B(this.b, (qjd) this.c);
    }

    @Override // defpackage.m9n
    public final void j() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                h00 h00Var = (h00) obj;
                ViewGroup viewGroup = h00Var.d;
                int height = (((viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()) * i) / 100;
                TextView textView = h00Var.p;
                int height2 = textView.getHeight();
                float textSize = textView.getTextSize();
                textView.setMaxLines(1);
                textView.setTextSize(0, (textSize * height) / height2);
                break;
            default:
                ((upm) obj).e(i);
                break;
        }
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        int[] iArr = ((zo4) this.c).l;
        int length = iArr.length;
        int i = this.b;
        return remoteMediaClient.queueJumpToItem(i < length ? iArr[i] : 0, (JSONObject) null);
    }
}
