package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.r;
import com.opera.android.undo.UndoBar;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class um3 extends UndoBar {
    public final /* synthetic */ gn3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um3(gn3 gn3Var, r rVar, vwh vwhVar, va2 va2Var, xm3 xm3Var) {
        super(rVar, vwhVar, va2Var, xm3Var, true);
        Objects.requireNonNull(gn3Var);
        this.l = gn3Var;
    }

    @Override // com.opera.android.undo.UndoBar
    public final void b(mkm mkmVar) {
        this.l.l(Stream.-EL.toList(Collections.unmodifiableList((ArrayList) mkmVar.a.c).stream().map(new mn((byte) 2))));
        f();
    }

    @Override // com.opera.android.undo.UndoBar
    public final void f() {
        String string;
        gn3 gn3Var = this.l;
        int i = gn3Var.N;
        Activity activity = this.a;
        if (i > 0) {
            Resources resources = activity.getResources();
            int i2 = gn3Var.N;
            string = String.valueOf(resources.getQuantityString(2131886096, i2, Integer.valueOf(i2)));
        } else {
            string = "";
        }
        if (gn3Var.M > 0) {
            if (gn3Var.N > 0) {
                string = string.concat("\n");
            }
            StringBuilder sb = new StringBuilder(string);
            Resources resources2 = activity.getResources();
            int i3 = gn3Var.M;
            sb.append(resources2.getQuantityString(2131886095, i3, Integer.valueOf(i3)));
            string = sb.toString();
        }
        ami amiVar = this.b;
        amiVar.e = string;
        gtj gtjVar = (gtj) amiVar.c;
        if (gtjVar != null) {
            ((na3) gtjVar.a).i.getChildAt(0).a.setText(string);
        }
    }
}
