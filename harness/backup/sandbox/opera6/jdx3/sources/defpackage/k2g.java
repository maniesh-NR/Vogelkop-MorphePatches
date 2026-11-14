package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.service.autofill.Dataset;
import android.view.autofill.AutofillId;
import android.widget.inline.InlinePresentationSpec;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class k2g implements Parcelable {
    public final zyk a;
    public final zyk b;

    public k2g() {
        final byte b = 0;
        z4c.b(new Function0(this) { // from class: f2g
            public final /* synthetic */ k2g b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                boolean z = false;
                k2g k2gVar = this.b;
                switch (b2) {
                    case 0:
                        vz8[] vz8VarArrB = k2gVar.b();
                        int length = vz8VarArrB.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (vz8VarArrB[i].e) {
                                    z = true;
                                } else {
                                    i++;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int i2 = 0;
                        for (vz8 vz8Var : k2gVar.b()) {
                            i2 |= vz8Var.c.a;
                        }
                        return Integer.valueOf(i2);
                    default:
                        vz8[] vz8VarArrB2 = k2gVar.b();
                        ArrayList arrayList = new ArrayList(vz8VarArrB2.length);
                        for (vz8 vz8Var2 : vz8VarArrB2) {
                            arrayList.add(vz8Var2.a);
                        }
                        return (AutofillId[]) arrayList.toArray(new AutofillId[0]);
                }
            }
        });
        final byte b2 = 1;
        this.a = z4c.b(new Function0(this) { // from class: f2g
            public final /* synthetic */ k2g b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                boolean z = false;
                k2g k2gVar = this.b;
                switch (b22) {
                    case 0:
                        vz8[] vz8VarArrB = k2gVar.b();
                        int length = vz8VarArrB.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (vz8VarArrB[i].e) {
                                    z = true;
                                } else {
                                    i++;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int i2 = 0;
                        for (vz8 vz8Var : k2gVar.b()) {
                            i2 |= vz8Var.c.a;
                        }
                        return Integer.valueOf(i2);
                    default:
                        vz8[] vz8VarArrB2 = k2gVar.b();
                        ArrayList arrayList = new ArrayList(vz8VarArrB2.length);
                        for (vz8 vz8Var2 : vz8VarArrB2) {
                            arrayList.add(vz8Var2.a);
                        }
                        return (AutofillId[]) arrayList.toArray(new AutofillId[0]);
                }
            }
        });
        final byte b3 = 2;
        this.b = z4c.b(new Function0(this) { // from class: f2g
            public final /* synthetic */ k2g b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                boolean z = false;
                k2g k2gVar = this.b;
                switch (b22) {
                    case 0:
                        vz8[] vz8VarArrB = k2gVar.b();
                        int length = vz8VarArrB.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (vz8VarArrB[i].e) {
                                    z = true;
                                } else {
                                    i++;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        int i2 = 0;
                        for (vz8 vz8Var : k2gVar.b()) {
                            i2 |= vz8Var.c.a;
                        }
                        return Integer.valueOf(i2);
                    default:
                        vz8[] vz8VarArrB2 = k2gVar.b();
                        ArrayList arrayList = new ArrayList(vz8VarArrB2.length);
                        for (vz8 vz8Var2 : vz8VarArrB2) {
                            arrayList.add(vz8Var2.a);
                        }
                        return (AutofillId[]) arrayList.toArray(new AutofillId[0]);
                }
            }
        });
    }

    public abstract j2g a();

    public abstract vz8[] b();

    public Dataset c(Context context, r3g r3gVar, InlinePresentationSpec inlinePresentationSpec, boolean z) {
        throw new IllegalStateException("Not implemented");
    }
}
