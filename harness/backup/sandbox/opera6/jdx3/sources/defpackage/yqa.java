package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.widget.EditText;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class yqa implements xc2, mfa, ssf {
    public static final String[] d = {"city_id", Constants.Params.NAME, Constants.Params.STATE, "zip_code", "origin", "country_code", "language_code", "selected_state"};
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public yqa(byte b) {
        this.a = b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                this.b = new i7f();
                break;
            case 12:
                this.b = new HashSet();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                this.c = new Object();
                break;
            case 21:
                break;
            case SizeUtil.textSize1 /* 22 */:
                this.b = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.c = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
                break;
            case 27:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }

    public yqa(Animator animator) {
        this.a = (byte) 17;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public yqa(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 29:
                this.b = context.getApplicationContext();
                this.c = new xq0(new n9a((byte) 20));
                break;
            default:
                this.b = context == null ? null : context.getApplicationContext();
                break;
        }
    }

    public yqa(Context context, umi umiVar) {
        this.a = (byte) 1;
        i32 i32Var = new i32(this, context, umiVar);
        this.b = i32Var;
        i32Var.h();
    }

    public yqa(Animation animation) {
        this.a = (byte) 17;
        this.b = animation;
        this.c = null;
    }

    public yqa(EditText editText) {
        this.a = (byte) 14;
        this.b = editText;
        jz7 jz7Var = new jz7(editText);
        this.c = jz7Var;
        editText.addTextChangedListener(jz7Var);
        if (cy7.b == null) {
            synchronized (cy7.a) {
                if (cy7.b == null) {
                    cy7 cy7Var = new cy7();
                    try {
                        cy7.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, cy7.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    cy7.b = cy7Var;
                }
            }
        }
        editText.setEditableFactory(cy7.b);
    }

    public yqa(b30 b30Var, eme emeVar, zxd zxdVar) {
        this.a = (byte) 23;
        bpd bpdVar = new bpd((byte) 9);
        l45 l45Var = new l45();
        l45Var.a = emeVar;
        l45Var.b = bpdVar;
        l45Var.c = new ConcurrentHashMap();
        this.b = b30Var;
        this.c = l45Var;
    }

    public yqa(byg bygVar) {
        this.a = (byte) 27;
        this.b = new HashMap(bygVar.a);
        this.c = new HashMap(bygVar.b);
    }

    public yqa(BrowserActivity browserActivity) {
        this.a = (byte) 7;
        this.c = browserActivity;
    }

    public yqa(db dbVar, Context context) {
        this.a = (byte) 2;
        Objects.requireNonNull(dbVar);
        this.c = dbVar;
        this.b = context.getApplicationContext();
    }

    public /* synthetic */ yqa(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yqa(String str, String str2, String str3, boolean z) {
        this.a = (byte) 9;
        this.b = str;
        this.c = !z ? null : (StringsKt.E(str2, "pt-PT", true) || StringsKt.E(str3, "pt-PT", true)) ? szb.i : szb.d(1, str);
    }

    public yqa(ArrayList arrayList, HashSet hashSet) {
        this.a = (byte) 26;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public yqa(n9a n9aVar, qa0 qa0Var) {
        this.a = (byte) 3;
        this.b = n9aVar;
        this.c = qa0Var;
        final byte b = 0;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                yqa yqaVar = this.b;
                switch (b2) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
        final byte b2 = 1;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                yqa yqaVar = this.b;
                switch (b22) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
        final byte b3 = 2;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                yqa yqaVar = this.b;
                switch (b22) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
        final byte b4 = 3;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b4;
                yqa yqaVar = this.b;
                switch (b22) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
        final byte b5 = 4;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b5;
                yqa yqaVar = this.b;
                switch (b22) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
        final byte b6 = 5;
        z4c.b(new Function0(this) { // from class: sa0
            public final /* synthetic */ yqa b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b6;
                yqa yqaVar = this.b;
                switch (b22) {
                    case 0:
                        n9a n9aVar2 = (n9a) yqaVar.b;
                        qa0 qa0Var2 = (qa0) yqaVar.c;
                        if (((n70) qa0Var2.n(1)) == null) {
                            n9aVar2.getClass();
                            qa0Var2.q(1, 1, new n70(2431, 1, 3));
                        }
                        return new y55();
                    case 1:
                        n9a n9aVar3 = (n9a) yqaVar.b;
                        qa0 qa0Var3 = (qa0) yqaVar.c;
                        if (((h90) qa0Var3.n(2)) == null) {
                            n9aVar3.getClass();
                            qa0Var3.q(2, 1, new h90(2431, 1, 5));
                        }
                        return new qii();
                    case 2:
                        n9a n9aVar4 = (n9a) yqaVar.b;
                        qa0 qa0Var4 = (qa0) yqaVar.c;
                        if (((fh0) qa0Var4.n(6)) == null) {
                            n9aVar4.getClass();
                            qa0Var4.q(6, 1, new fh0(2431, 1, 5));
                        }
                        return new ulp((byte) 17);
                    case 3:
                        n9a n9aVar5 = (n9a) yqaVar.b;
                        qa0 qa0Var5 = (qa0) yqaVar.c;
                        if (((oo0) qa0Var5.n(11)) == null) {
                            n9aVar5.getClass();
                            qa0Var5.q(11, 1, new oo0(2431, 1, 4));
                        }
                        return new psp();
                    case 4:
                        n9a n9aVar6 = (n9a) yqaVar.b;
                        qa0 qa0Var6 = (qa0) yqaVar.c;
                        if (((fp0) qa0Var6.n(12)) == null) {
                            n9aVar6.getClass();
                            qa0Var6.q(12, 1, new fp0(2431, 1, 4));
                        }
                        return new n9a((byte) 19);
                    default:
                        n9a n9aVar7 = (n9a) yqaVar.b;
                        qa0 qa0Var7 = (qa0) yqaVar.c;
                        if (((pb0) qa0Var7.n(14)) == null) {
                            n9aVar7.getClass();
                            qa0Var7.q(14, 1, new pb0(2431, 1, 7));
                        }
                        return new qs7((byte) 17);
                }
            }
        });
    }

    public yqa(q15 q15Var, ayd aydVar, esg esgVar) {
        this.a = (byte) 6;
        this.b = esgVar;
        this.c = new ConcurrentHashMap();
    }

    public yqa(uqe uqeVar, lld lldVar) {
        this.a = (byte) 24;
        Objects.requireNonNull(uqeVar);
        this.c = uqeVar;
        this.b = lldVar;
    }

    public yqa(y5i y5iVar) {
        this.a = (byte) 20;
        this.b = y5iVar;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    @Override // defpackage.ssf
    public final void H(ByteArrayOutputStream byteArrayOutputStream, rsf rsfVar) throws IOException {
        w56 w56Var = ((zwh) rsfVar).b;
        int i = xq0.d;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(2);
            xq0.f4(dataOutputStream, w56Var);
        } finally {
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(fr6 r5, java.lang.Throwable r6, mt5 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.uqa
            if (r0 == 0) goto L13
            r0 = r7
            uqa r0 = (defpackage.uqa) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            uqa r0 = new uqa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.t
            px5 r7 = px5.a
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ybh.y(r4)
            goto L6c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            ybh.y(r4)
            kotlin.coroutines.CoroutineContext r4 = r5.l()
            unb r4 = o0g.U(r4)
            ynb r4 = (ynb) r4
            if (r6 != 0) goto L43
            kotlin.Unit r6 = kotlin.Unit.a
            r4.j0(r6)
            goto L56
        L43:
            boolean r1 = r6 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L4d
            java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6
            r4.B(r6)
            goto L56
        L4d:
            java.lang.String r1 = "Exception occurred during request execution"
            java.util.concurrent.CancellationException r6 = na2.a(r1, r6)
            r4.B(r6)
        L56:
            boolean r6 = ne7.a(r5)
            if (r6 != 0) goto L63
            d44 r5 = r5.b()     // Catch: java.lang.Throwable -> L63
            nb6.g(r5)     // Catch: java.lang.Throwable -> L63
        L63:
            r0.v = r2
            java.lang.Object r4 = r4.Z(r0)
            if (r4 != r7) goto L6c
            return r7
        L6c:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqa.a(fr6, java.lang.Throwable, mt5):java.lang.Object");
    }

    @Override // defpackage.ssf
    public final rsf b() {
        return new zwh(this, n9a.o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (r12 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r11 != r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [yqa] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [yqa] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v4, types: [fr6, java.lang.Object, nx5] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(hz1 r11, mt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqa.c(hz1, mt5):java.lang.Object");
    }

    public final ListenableFuture call() {
        gg8 gg8Var = (gg8) this.b;
        int i = gg8.e;
        if (gg8Var.compareAndSet(fg8.a, fg8.c)) {
            return ((xc2) this.c).call();
        }
        n0b n0bVar = n0b.a;
        return n0bVar != null ? n0bVar : new n0b();
    }

    public final v1g d(ifa ifaVar, efa efaVar) {
        ((hv5) this.b).getClass();
        return new z8b(new lfa(ifaVar, efaVar), (List) this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(mt5 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wqa
            if (r0 == 0) goto L13
            r0 = r9
            wqa r0 = (defpackage.wqa) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            wqa r0 = new wqa
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            fr6 r8 = r0.u
            ybh.y(r9)     // Catch: java.util.concurrent.CancellationException -> L86
            return r8
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r6
        L36:
            tna r2 = r0.t
            ybh.y(r9)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L6c
        L3c:
            ybh.y(r9)     // Catch: java.util.concurrent.CancellationException -> L86
            goto L5f
        L40:
            ybh.y(r9)
            spa r9 = new spa     // Catch: java.util.concurrent.CancellationException -> L86
            r9.<init>()     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r2 = r8.b     // Catch: java.util.concurrent.CancellationException -> L86
            spa r2 = (spa) r2     // Catch: java.util.concurrent.CancellationException -> L86
            csk r7 = r2.e     // Catch: java.util.concurrent.CancellationException -> L86
            r9.e = r7     // Catch: java.util.concurrent.CancellationException -> L86
            r9.b(r2)     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r2 = r8.c     // Catch: java.util.concurrent.CancellationException -> L86
            pna r2 = (pna) r2     // Catch: java.util.concurrent.CancellationException -> L86
            r0.x = r5     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r9 = r2.h(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r9 == r1) goto L84
        L5f:
            r2 = r9
            tna r2 = (tna) r2     // Catch: java.util.concurrent.CancellationException -> L86
            r0.t = r2     // Catch: java.util.concurrent.CancellationException -> L86
            r0.x = r4     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r9 = ocp.o(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r9 == r1) goto L84
        L6c:
            tna r9 = (tna) r9     // Catch: java.util.concurrent.CancellationException -> L86
            fr6 r9 = r9.c     // Catch: java.util.concurrent.CancellationException -> L86
            if (r9 != 0) goto L73
            r9 = r6
        L73:
            fr6 r2 = r2.c     // Catch: java.util.concurrent.CancellationException -> L86
            if (r2 != 0) goto L78
            r2 = r6
        L78:
            r0.t = r6     // Catch: java.util.concurrent.CancellationException -> L86
            r0.u = r9     // Catch: java.util.concurrent.CancellationException -> L86
            r0.x = r3     // Catch: java.util.concurrent.CancellationException -> L86
            java.lang.Object r8 = r8.a(r2, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L86
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            return r9
        L86:
            r8 = move-exception
            java.lang.Throwable r8 = i41.r0(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqa.e(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.xqa
            if (r0 == 0) goto L13
            r0 = r8
            xqa r0 = (defpackage.xqa) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            xqa r0 = new xqa
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r8)     // Catch: java.util.concurrent.CancellationException -> L61
            goto L59
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L2e:
            ybh.y(r8)
            spa r8 = new spa     // Catch: java.util.concurrent.CancellationException -> L61
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r2 = r7.b     // Catch: java.util.concurrent.CancellationException -> L61
            spa r2 = (spa) r2     // Catch: java.util.concurrent.CancellationException -> L61
            csk r5 = r2.e     // Catch: java.util.concurrent.CancellationException -> L61
            r8.e = r5     // Catch: java.util.concurrent.CancellationException -> L61
            r8.b(r2)     // Catch: java.util.concurrent.CancellationException -> L61
            jf2 r2 = ne7.a     // Catch: java.util.concurrent.CancellationException -> L61
            pj5 r2 = r8.f     // Catch: java.util.concurrent.CancellationException -> L61
            jf2 r5 = ne7.a     // Catch: java.util.concurrent.CancellationException -> L61
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.util.concurrent.CancellationException -> L61
            r2.f(r5, r6)     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r7 = r7.c     // Catch: java.util.concurrent.CancellationException -> L61
            pna r7 = (pna) r7     // Catch: java.util.concurrent.CancellationException -> L61
            r0.v = r4     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r8 = r7.h(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r8 != r1) goto L59
            return r1
        L59:
            tna r8 = (tna) r8     // Catch: java.util.concurrent.CancellationException -> L61
            fr6 r7 = r8.c     // Catch: java.util.concurrent.CancellationException -> L61
            if (r7 == 0) goto L60
            return r7
        L60:
            return r3
        L61:
            r7 = move-exception
            java.lang.Throwable r7 = i41.r0(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqa.f(mt5):java.lang.Object");
    }

    public final rg2 g(pf2 pf2Var, oj9 oj9Var) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        int i;
        oj9Var.getClass();
        pf2Var.getClass();
        int i2 = oj9Var.G;
        if (i2 == -1) {
            return rg2.d;
        }
        Context context = (Context) this.b;
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = scd.E(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.c = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                this.c = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = oj9Var.n;
        str.getClass();
        int iD = dzd.d(str, oj9Var.k);
        if (iD == 0 || (i = Build.VERSION.SDK_INT) < tym.q(iD)) {
            return rg2.d;
        }
        int iR = tym.r(oj9Var.F);
        if (iR == 0) {
            return rg2.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iR).setEncoding(iD).build();
            if (i >= 31) {
                return m41.r(audioFormatBuild, pf2Var.b(), zBooleanValue);
            }
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, pf2Var.b())) {
                return rg2.d;
            }
            ukh ukhVar = new ukh((byte) 1);
            ukhVar.b = true;
            ukhVar.d = zBooleanValue;
            return ukhVar.a();
        } catch (IllegalArgumentException unused) {
            return rg2.d;
        }
    }

    public final rxd h(String str) {
        if (!((ConcurrentHashMap) this.c).containsKey(str)) {
            synchronized (this) {
                if (!((ConcurrentHashMap) this.c).containsKey(str)) {
                    try {
                        for (vdg vdgVar : ayd.a(q15.a(str))) {
                            esg esgVar = (esg) this.b;
                            i16 i16Var = (i16) esgVar.c;
                            if (((String) ((p9d) i16Var.c).t(vdgVar)).equals("001")) {
                                ((i16) esgVar.b).b(vdgVar);
                            } else {
                                i16Var.b(vdgVar);
                            }
                        }
                        ((ConcurrentHashMap) this.c).put(str, str);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw new IllegalStateException("Failed to read file ".concat(str), e);
                    }
                }
            }
        }
        return (esg) this.b;
    }

    public final void i(qo7 qo7Var, boolean z) {
        if (qo7Var.g) {
            j70 j70Var = z ? j70.b : j70.c;
            osf osfVar = (osf) ((esk) this.c).get();
            String str = qo7Var.a;
            osfVar.getClass();
            osfVar.a(new jkc(str, j70Var, (byte) 28));
        }
    }

    public final void j(dl5 dl5Var) {
        dl5Var.b.l((a4g) this.c);
        qdc lifecycle = dl5Var.a.getLifecycle();
        lifecycle.a(new jp3(this, lifecycle, dl5Var));
        if (lifecycle.i != qcc.a) {
            ((i7f) this.b).b(dl5Var);
        }
    }

    public final v1g k() {
        return new z8b(((hv5) this.b).k(), (List) this.c);
    }

    public final void l(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        h1b h1bVarS = h1b.s(hashSet);
        hashSet.clear();
        a1b a1bVarU = h1bVarS.u(0);
        while (a1bVarU.hasNext()) {
            tn6 tn6Var = (tn6) a1bVarU.next();
            tn6Var.getClass();
            tn6Var.i(z ? 1 : 3, exc);
        }
    }

    public final void m() {
        Context context = (Context) this.b;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.b0(jh0.b);
        db dbVar = (db) this.c;
        h7f h7fVar = dbVar.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((cb) g7fVarH.next()).b();
        }
        dbVar.d = null;
        n1 n1Var = dbVar.f;
        if (n1Var != null) {
            ((wjh) n1Var.b).t(null);
        }
        dbVar.g = null;
    }

    public final void n(tn6 tn6Var) {
        ((HashSet) this.b).add(tn6Var);
        if (((tn6) this.c) != null) {
            return;
        }
        this.c = tn6Var;
        xh8 provisionRequest = tn6Var.b.getProvisionRequest();
        tn6Var.z = provisionRequest;
        rn6 rn6Var = tn6Var.s;
        String str = tym.a;
        provisionRequest.getClass();
        rn6Var.getClass();
        rn6Var.obtainMessage(1, new sn6(provisionRequest, bsc.g.getAndIncrement(), SystemClock.elapsedRealtime(), true)).sendToTarget();
    }

    public final void o(vxg vxgVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.b;
        if (vxgVar == null) {
            t3p.q("primitive constructor must be non-null");
            return;
        }
        ayg aygVar = new ayg(vxgVar.a, vxgVar.b);
        if (!map.containsKey(aygVar)) {
            map.put(aygVar, vxgVar);
            return;
        }
        vxg vxgVar2 = (vxg) map.get(aygVar);
        if (vxgVar2.equals(vxgVar) && vxgVar == vxgVar2) {
            return;
        }
        pza.n(aygVar, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
    }

    public final void p(e20 e20Var) throws GeneralSecurityException {
        Class<k9h> cls;
        HashMap map = (HashMap) this.c;
        switch (e20Var.a) {
            case 0:
                cls = z10.class;
                break;
            case 1:
                cls = c05.class;
                break;
            case 2:
                cls = hxg.class;
                break;
            case 3:
                cls = i9h.class;
                break;
            default:
                cls = k9h.class;
                break;
        }
        if (!map.containsKey(cls)) {
            map.put(cls, e20Var);
            return;
        }
        e20 e20Var2 = (e20) map.get(cls);
        if (e20Var2.equals(e20Var) && e20Var.equals(e20Var2)) {
            return;
        }
        pza.n(cls, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
    }

    public final void q(a4g a4gVar) {
        if (((a4g) this.c) != a4gVar) {
            this.c = a4gVar;
            g7f g7fVar = new g7f((i7f) this.b);
            while (g7fVar.hasNext()) {
                dl5 dl5Var = (dl5) g7fVar.next();
                if (dl5Var.a.getLifecycle().i.d(qcc.c)) {
                    dl5Var.b.l((a4g) this.c);
                }
            }
        }
    }

    public final void r(Context context) {
        if (((x77) this.b) == null) {
            return;
        }
        String[] strArr = OperaApplication.K;
        ((ll9) context.getSystemService("com.opera.android.ui.FRAGMENT_CONTROLLER_SERVICE")).b(zhj.a(new dvc(((OperaApplication) context.getApplicationContext()).y(), (x77) this.b, this), 4099));
    }

    public final String s(Bundle bundle, String str) throws IOException {
        PendingIntent broadcast;
        bundle.putString("sender", str);
        bundle.putString("subscription", str);
        if (bundle.getString("subtype") == null) {
            bundle.putString("subtype", str);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            s49.m("MAIN_THREAD");
            return null;
        }
        if (cs5.K("com.google.android.gms", 0) == null) {
            s49.m("Google Play Services missing");
            return null;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Messenger messenger = new Messenger((Handler) new ue2(this, Looper.getMainLooper(), linkedBlockingQueue));
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        synchronized (this.c) {
            broadcast = (PendingIntent) this.b;
            if (broadcast == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                broadcast = PendingIntent.getBroadcast(t8.a, 0, intent2, 67108864);
                this.b = broadcast;
            }
        }
        intent.putExtra("app", broadcast);
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", messenger);
        t8.a.startService(intent);
        try {
            Intent intent3 = (Intent) linkedBlockingQueue.poll(5000L, TimeUnit.MILLISECONDS);
            if (intent3 == null) {
                s49.m("SERVICE_NOT_AVAILABLE");
                return null;
            }
            String stringExtra = intent3.getStringExtra(Constants.Defaults.PROPERTY_FCM_TOKEN_ID);
            if (stringExtra != null) {
                return stringExtra;
            }
            String stringExtra2 = intent3.getStringExtra("error");
            if (stringExtra2 == null) {
                stringExtra2 = "SERVICE_NOT_AVAILABLE";
            }
            throw new IOException(stringExtra2);
        } catch (InterruptedException e) {
            s49.m(e.getMessage());
            return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "HttpStatement[" + ((spa) this.b).a + ']';
            case 15:
                return ((xc2) this.c).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ssf
    public final rsf v(ByteArrayInputStream byteArrayInputStream) throws IOException {
        w56 w56VarO = n9a.o();
        xq0 xq0Var = (xq0) this.c;
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            xq0Var.K2(dataInputStream);
            xq0Var.a1(dataInputStream, w56VarO, dataInputStream.readShort());
            dataInputStream.close();
            return new zwh(this, w56VarO);
        } catch (Throwable th) {
            dataInputStream.close();
            throw th;
        }
    }
}
