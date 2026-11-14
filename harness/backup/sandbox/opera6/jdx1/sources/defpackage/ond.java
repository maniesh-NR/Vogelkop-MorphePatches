package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ond extends zp1 {
    public static final /* synthetic */ int U = 0;
    public boolean A;
    public boolean B;
    public ImageButton C;
    public Button D;
    public ImageView E;
    public View F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public String J;
    public z8b K;
    public final wmd L;
    public MediaDescriptionCompat M;
    public jnd N;
    public Bitmap O;
    public Uri P;
    public boolean Q;
    public Bitmap R;
    public int S;
    public final boolean T;
    public final dod g;
    public final lmd h;
    public vnd i;
    public cod j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final Context o;
    public boolean p;
    public boolean q;
    public long r;
    public final ue2 s;
    public RecyclerView t;
    public nnd u;
    public ehd v;
    public HashMap w;
    public cod x;
    public HashMap y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ond(Context context) {
        ContextThemeWrapper contextThemeWrapperY = o0g.y(context, 0, false);
        int iY = o0g.Y(2130970333, contextThemeWrapperY);
        super(contextThemeWrapperY, iY == 0 ? o0g.W(contextThemeWrapperY) : iY);
        this.i = vnd.c;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.s = new ue2(this, (byte) 9);
        Context context2 = getContext();
        this.o = context2;
        this.g = dod.d(context2);
        this.T = dod.h();
        this.h = new lmd(this, (byte) 5);
        this.j = dod.g();
        this.L = new wmd(this, (byte) 1);
        h(dod.e());
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            cod codVar = (cod) list.get(size);
            if (codVar.d() || !codVar.g || !codVar.h(this.i) || this.j == codVar) {
                list.remove(size);
            }
        }
    }

    public final void g() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.M;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        jnd jndVar = this.N;
        if (jndVar == null) {
            bitmap2 = this.O;
            uri2 = this.P;
        } else {
            Bitmap bitmap3 = jndVar.a;
            uri2 = jndVar.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            jnd jndVar2 = this.N;
            if (jndVar2 != null) {
                jndVar2.cancel(true);
            }
            jnd jndVar3 = new jnd(this);
            this.N = jndVar3;
            jndVar3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        z8b z8bVar = this.K;
        wmd wmdVar = this.L;
        if (z8bVar != null) {
            z8bVar.N(wmdVar);
            this.K = null;
        }
        if (mediaSessionCompat$Token == null || !this.q) {
            return;
        }
        z8b z8bVar2 = new z8b(this.o, mediaSessionCompat$Token);
        this.K = z8bVar2;
        z8bVar2.L(wmdVar);
        MediaMetadata metadata = ((a) this.K.a).a.getMetadata();
        if (metadata != null) {
            ArrayMap arrayMap = MediaMetadataCompat.d;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.b = metadata;
        } else {
            mediaMetadataCompatCreateFromParcel = null;
        }
        this.M = mediaMetadataCompatCreateFromParcel != null ? mediaMetadataCompatCreateFromParcel.a() : null;
        g();
        l();
    }

    public final void j(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (this.i.equals(vndVar)) {
            return;
        }
        this.i = vndVar;
        if (this.q) {
            dod dodVar = this.g;
            lmd lmdVar = this.h;
            dodVar.j(lmdVar);
            dodVar.a(vndVar, lmdVar, 1);
            m();
        }
    }

    public final void k() {
        Context context = this.o;
        getWindow().setLayout(!context.getResources().getBoolean(2131034127) ? -1 : wxe.B(context), context.getResources().getBoolean(2131034127) ? -2 : -1);
        this.O = null;
        this.P = null;
        g();
        l();
        n();
    }

    public final void l() {
        Bitmap bitmap;
        if ((this.x != null || this.z) ? true : !this.p) {
            this.B = true;
            return;
        }
        this.B = false;
        if (!this.j.g() || this.j.d()) {
            dismiss();
        }
        if (!this.Q || (((bitmap = this.R) != null && bitmap.isRecycled()) || this.R == null)) {
            Bitmap bitmap2 = this.R;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.R);
            }
            this.G.setVisibility(8);
            this.F.setVisibility(8);
            this.E.setImageBitmap(null);
        } else {
            this.G.setVisibility(0);
            this.G.setImageBitmap(this.R);
            this.G.setBackgroundColor(this.S);
            this.F.setVisibility(0);
            Bitmap bitmap3 = this.R;
            RenderScript renderScriptCreate = RenderScript.create(this.o);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
            allocationCreateTyped.copyTo(bitmapCopy);
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
            this.E.setImageBitmap(bitmapCopy);
        }
        this.Q = false;
        this.R = null;
        this.S = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.M;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.M;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.H;
        if (zIsEmpty) {
            textView.setText(this.J);
        } else {
            textView.setText(charSequence);
        }
        TextView textView2 = this.I;
        if (zIsEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(charSequence2);
            this.I.setVisibility(0);
        }
    }

    public final void m() {
        ArrayList arrayList = this.k;
        arrayList.clear();
        ArrayList arrayList2 = this.l;
        arrayList2.clear();
        ArrayList arrayList3 = this.m;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.j.v));
        ynd yndVarA = this.j.a();
        if (yndVarA != null) {
            bod bodVar = this.j.a;
            dod.b();
            for (cod codVar : Collections.unmodifiableList(bodVar.b)) {
                if (yndVarA.o(codVar)) {
                    arrayList2.add(codVar);
                }
                qnd qndVar = (qnd) yndVarA.x.get(codVar.c);
                if (qndVar != null && qndVar.e) {
                    arrayList3.add(codVar);
                }
            }
        }
        f(arrayList2);
        f(arrayList3);
        yg9 yg9Var = yg9.f;
        Collections.sort(arrayList, yg9Var);
        Collections.sort(arrayList2, yg9Var);
        Collections.sort(arrayList3, yg9Var);
        this.u.J();
    }

    public final void n() {
        if (this.q) {
            if (SystemClock.uptimeMillis() - this.r < 300) {
                ue2 ue2Var = this.s;
                ue2Var.removeMessages(1);
                ue2Var.sendEmptyMessageAtTime(1, this.r + 300);
                return;
            }
            if ((this.x != null || this.z) ? true : !this.p) {
                this.A = true;
                return;
            }
            this.A = false;
            if (!this.j.g() || this.j.d()) {
                dismiss();
            }
            this.r = SystemClock.uptimeMillis();
            this.u.I();
        }
    }

    public final void o() {
        if (this.A) {
            n();
        }
        if (this.B) {
            l();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
        this.g.a(this.i, this.h, 1);
        m();
        h(dod.e());
    }

    @Override // defpackage.zp1, defpackage.ce5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559067);
        View decorView = getWindow().getDecorView();
        Context context = this.o;
        decorView.setBackgroundColor(context.getColor(o0g.g0(context) ? 2131101259 : 2131101258));
        ImageButton imageButton = (ImageButton) findViewById(2131363554);
        this.C = imageButton;
        imageButton.setColorFilter(-1);
        final byte b = 0;
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: ind
            public final /* synthetic */ ond b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ond ondVar = this.b;
                switch (b2) {
                    case 0:
                        ondVar.dismiss();
                        break;
                    default:
                        if (ondVar.j.g()) {
                            ondVar.g.getClass();
                            dod.n(2);
                        }
                        ondVar.dismiss();
                        break;
                }
            }
        });
        Button button = (Button) findViewById(2131363570);
        this.D = button;
        button.setTextColor(-1);
        final byte b2 = 1;
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: ind
            public final /* synthetic */ ond b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                ond ondVar = this.b;
                switch (b22) {
                    case 0:
                        ondVar.dismiss();
                        break;
                    default:
                        if (ondVar.j.g()) {
                            ondVar.g.getClass();
                            dod.n(2);
                        }
                        ondVar.dismiss();
                        break;
                }
            }
        });
        this.u = new nnd(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131363560);
        this.t = recyclerView;
        recyclerView.y0(this.u);
        this.t.C0(new LinearLayoutManager());
        this.v = new ehd(this, (byte) 1);
        this.w = new HashMap();
        this.y = new HashMap();
        this.E = (ImageView) findViewById(2131363562);
        this.F = findViewById(2131363563);
        this.G = (ImageView) findViewById(2131363561);
        TextView textView = (TextView) findViewById(2131363565);
        this.H = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(2131363564);
        this.I = textView2;
        textView2.setTextColor(-1);
        this.J = context.getResources().getString(2132019820);
        this.p = true;
        k();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = false;
        this.g.j(this.h);
        this.s.removeCallbacksAndMessages(null);
        h(null);
    }
}
