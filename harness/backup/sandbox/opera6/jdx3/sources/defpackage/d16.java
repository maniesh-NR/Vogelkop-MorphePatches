package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.autofill.Dataset;
import android.service.autofill.InlinePresentation;
import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import android.widget.inline.InlinePresentationSpec;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import java.util.ArrayList;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d16 extends k2g {

    @NotNull
    public static final Parcelable.Creator<d16> CREATOR = new hh3((byte) 10);
    public final vz8[] c;
    public final j2g d;

    public d16(vz8[] vz8VarArr, j2g j2gVar) {
        this.c = vz8VarArr;
        this.d = j2gVar;
    }

    @Override // defpackage.k2g
    public final j2g a() {
        return this.d;
    }

    @Override // defpackage.k2g
    public final vz8[] b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k2g
    public final Dataset c(Context context, r3g r3gVar, InlinePresentationSpec inlinePresentationSpec, boolean z) throws NumberFormatException {
        Dataset dataset;
        e16 e16Var;
        IntentSender intentSender;
        String strR0;
        RemoteViews remoteViews;
        e16 e16Var2;
        int i;
        int i2;
        RemoteViews remoteViews2;
        InlinePresentation inlinePresentationA;
        InlinePresentationSpec inlinePresentationSpec2;
        Bitmap bitmapA;
        r3g r3gVar2 = r3gVar != null ? r3gVar : null;
        if (r3gVar2 == null) {
            qp2.n("");
            return null;
        }
        int i3 = 0;
        if (inlinePresentationSpec != null) {
            int i4 = OperaAutofillIntentDispatcherActivity.i;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.opera.android.autofill.EXTRA_PARTITION", this);
            bundle.putParcelable("com.opera.android.autofill.EXTRA_DATA", r3gVar2);
            dataset = 0;
            if (Build.VERSION.SDK_INT >= 30) {
                bundle.putParcelable("com.opera.android.autofill.EXTRA_INLINE_SPEC", inlinePresentationSpec);
            }
            e16Var = new e16(inlinePresentationSpec, PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) OperaAutofillIntentDispatcherActivity.class).setAction("com.opera.android.autofill.ACTION_EDIT_PASSWORD").putExtra("com.opera.android.autofill.EXTRA_BUNDLE", bundle), 301989888));
        } else {
            dataset = 0;
            e16Var = null;
        }
        ArrayList arrayList = new ArrayList();
        String strR02 = r3gVar2.R0();
        String str = strR02 != null ? strR02 : "";
        vz8[] vz8VarArr = this.c;
        int length = vz8VarArr.length;
        int i5 = 0;
        while (i5 < length) {
            vz8 vz8Var = vz8VarArr[i5];
            vz8[] vz8VarArr2 = vz8VarArr;
            switch (vz8Var.c.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 7:
                case 8:
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                case 12:
                    strR0 = dataset;
                    break;
                case 3:
                case 6:
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    strR0 = r3gVar2.R0();
                    break;
                case 5:
                case 11:
                    strR0 = r3gVar2.getPassword();
                    break;
                default:
                    h9o.p();
                    return dataset;
            }
            int i6 = i5;
            AutofillValue autofillValueD = vz8Var.d.d(strR0);
            RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), 2131559088);
            remoteViews3.setTextViewText(2131364500, r3gVar2.R0());
            remoteViews3.setImageViewIcon(2131362594, sfe.a0(context, r3gVar2));
            RemoteViews remoteViews4 = new RemoteViews(context.getPackageName(), 2131559086);
            String strR03 = r3gVar2.R0();
            if (strR03 == null || strR03.length() == 0) {
                strR03 = context.getString(2132017836);
            }
            remoteViews4.setTextViewText(2131364500, strR03);
            remoteViews4.setImageViewIcon(2131362594, sfe.a0(context, r3gVar2));
            if (Build.VERSION.SDK_INT < 30 || e16Var == null || (inlinePresentationSpec2 = e16Var.a) == null) {
                remoteViews = remoteViews4;
                e16Var2 = e16Var;
                i = length;
                i2 = 0;
                remoteViews2 = remoteViews3;
                inlinePresentationA = dataset;
            } else {
                remoteViews = remoteViews4;
                x79 x79Var = new x79(e16Var.b);
                String strR04 = r3gVar2.R0();
                if (strR04 == null || strR04.length() == 0) {
                    strR04 = context.getString(2132017836);
                }
                x79Var.d = strR04;
                String strR05 = r3gVar2.R0();
                if (strR05 == null || strR05.length() == 0) {
                    strR05 = context.getString(2132017836);
                }
                x79Var.e = strR05;
                e16Var2 = e16Var;
                i = length;
                i2 = 0;
                x79Var.c = (!c.q(r3gVar2.o(), "android", false) || (bitmapA = rab.a(context, r3gVar2.o())) == null) ? Icon.createWithResource(context, 2131232199) : Icon.createWithBitmap(bitmapA).setTintMode(PorterDuff.Mode.DST);
                remoteViews2 = remoteViews3;
                inlinePresentationA = dz0.a(x79Var.j().a, inlinePresentationSpec2);
            }
            arrayList.add(new og6(vz8Var, autofillValueD, remoteViews2, remoteViews, inlinePresentationA));
            i5 = i6 + 1;
            i3 = i2;
            vz8VarArr = vz8VarArr2;
            e16Var = e16Var2;
            length = i;
        }
        int i7 = i3;
        if (z) {
            intentSender = dataset;
        } else {
            int i8 = Integer.parseInt(r3gVar2.getId());
            int i9 = OperaAutofillIntentDispatcherActivity.i;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("com.opera.android.autofill.EXTRA_PARTITION", this);
            bundle2.putParcelable("com.opera.android.autofill.EXTRA_DATA", r3gVar2);
            if (Build.VERSION.SDK_INT >= 30) {
                bundle2.putParcelable("com.opera.android.autofill.EXTRA_INLINE_SPEC", inlinePresentationSpec);
            }
            intentSender = PendingIntent.getActivity(context, i8, new Intent(context, (Class<?>) OperaAutofillIntentDispatcherActivity.class).setAction("com.opera.android.autofill.ACTION_AUTHORIZE").putExtra("com.opera.android.autofill.EXTRA_BUNDLE", bundle2).addFlags(1073741824).addFlags(8388608).addFlags(65536), 301989888).getIntentSender();
        }
        Dataset.Builder authentication = new Dataset.Builder().setId(str).setAuthentication(intentSender);
        int size = arrayList.size();
        int i10 = i7;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            og6 og6Var = (og6) obj;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                t8.e(authentication, og6Var);
            } else if (i11 >= 31) {
                r9n.a(authentication, og6Var);
            } else if (i11 >= 30) {
                r9n.c(authentication, og6Var);
            } else {
                authentication.setValue(og6Var.a.a, og6Var.b);
            }
        }
        return authentication.build();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final java.lang.Iterable d(android.content.Context r19, android.widget.inline.InlinePresentationSpec r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d16.d(android.content.Context, android.widget.inline.InlinePresentationSpec):java.lang.Iterable");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        vz8[] vz8VarArr = this.c;
        int length = vz8VarArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeParcelable(vz8VarArr[i2], i);
        }
        parcel.writeParcelable(this.d, i);
    }
}
