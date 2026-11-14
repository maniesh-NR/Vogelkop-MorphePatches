package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import defpackage.g0k;
import defpackage.g8;
import defpackage.gig;
import defpackage.r3n;
import defpackage.r4n;
import defpackage.tym;
import defpackage.uig;
import defpackage.vkg;
import defpackage.xh4;
import defpackage.yhh;
import defpackage.zig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int C = 0;
    public final boolean A;
    public final boolean B;
    public final vkg a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final ImageView f;
    public final ImageView g;
    public final SubtitleView h;
    public final View i;
    public final TextView j;
    public final uig k;
    public final FrameLayout l;
    public final Handler m;
    public final Class n;
    public final Method o;
    public final Object p;
    public gig q;
    public final boolean r;
    public yzb s;
    public int t;
    public final int u;
    public final Drawable v;
    public final int w;
    public final boolean x;
    public int y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        Throwable th;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        super(context, attributeSet, 0);
        vkg vkgVar = new vkg(this);
        this.a = vkgVar;
        this.m = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.n = null;
            this.o = null;
            this.p = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            String str = tym.a;
            imageView.setImageDrawable(resources.getDrawable(2131231393, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(2131100186, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, yhh.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, 2131558705);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                th = null;
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.x = typedArrayObtainStyledAttributes.getBoolean(16, this.x);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = zHasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i = 5000;
            i2 = 2131558705;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayoutFindViewById = findViewById(2131362771);
        this.b = aspectRatioFrameLayoutFindViewById;
        if (aspectRatioFrameLayoutFindViewById != null && aspectRatioFrameLayoutFindViewById.d != i6) {
            aspectRatioFrameLayoutFindViewById.d = i6;
            aspectRatioFrameLayoutFindViewById.requestLayout();
        }
        View viewFindViewById = findViewById(2131362806);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayoutFindViewById == null || i7 == 0) {
            i10 = 0;
            this.d = th;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.d = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    int i15 = g0k.l;
                    this.d = (View) g0k.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(vkgVar);
                    i10 = 0;
                    this.d.setClickable(false);
                    aspectRatioFrameLayoutFindViewById.addView(this.d, 0);
                } catch (Exception e) {
                    h9o.m("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i7 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    g8.V(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i16 = r3n.a;
                    this.d = (View) r3n.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    h9o.m("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(vkgVar);
            i10 = 0;
            this.d.setClickable(false);
            aspectRatioFrameLayoutFindViewById.addView(this.d, 0);
        }
        this.e = z7;
        this.l = (FrameLayout) findViewById(2131362791);
        this.f = (ImageView) findViewById(2131362783);
        this.u = i5;
        try {
            cls = ExoPlayer.class;
            short s = ExoPlayer.a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: ukg
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i17 = PlayerView.C;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.a;
                    playerView.m.post(new q2g(playerView, bitmap, (byte) 4));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.n = cls;
        this.o = method;
        this.p = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(2131362763);
        this.g = imageView2;
        this.t = (!z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
        if (i4 != 0) {
            this.v = getContext().getDrawable(i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(2131362809);
        this.h = subtitleView;
        if (subtitleView != null) {
            boolean zIsInEditMode = subtitleView.isInEditMode();
            xh4 xh4Var = xh4.g;
            if (!zIsInEditMode && (captioningManager2 = (CaptioningManager) subtitleView.getContext().getSystemService("captioning")) != null && captioningManager2.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                xh4Var = new xh4(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : i10, userStyle.hasEdgeType() ? userStyle.edgeType : i10, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
            }
            subtitleView.b = xh4Var;
            subtitleView.a();
            float fontScale = 1.0f;
            if (!subtitleView.isInEditMode() && (captioningManager = (CaptioningManager) subtitleView.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                fontScale = captioningManager.getFontScale();
            }
            subtitleView.c = fontScale * 0.0533f;
            subtitleView.a();
        }
        View viewFindViewById2 = findViewById(2131362768);
        this.i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.w = i3;
        TextView textView = (TextView) findViewById(2131362776);
        this.j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        uig uigVar = (uig) findViewById(2131362772);
        View viewFindViewById3 = findViewById(2131362773);
        if (uigVar != null) {
            this.k = uigVar;
        } else if (viewFindViewById3 != null) {
            uigVar = new uig(context, attributeSet);
            this.k = uigVar;
            uigVar.setId(2131362772);
            uigVar.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(uigVar, iIndexOfChild);
        } else {
            this.k = null;
            uigVar = null;
        }
        this.y = uigVar != null ? i : i10;
        this.B = z;
        this.z = z2;
        this.A = z3;
        this.r = (!z5 || uigVar == null) ? i10 : 1;
        if (uigVar != null) {
            zig zigVar = uigVar.a;
            byte b = zigVar.A;
            if (b != 3 && b != 2) {
                zigVar.e();
                zigVar.h(2);
            }
            vkg vkgVar2 = this.a;
            vkgVar2.getClass();
            uigVar.j.add(vkgVar2);
        }
        if (z5) {
            setClickable(true);
        }
        m();
    }

    public final boolean a() {
        gig gigVar = this.q;
        return gigVar != null && this.p != null && gigVar.C(30) && gigVar.w().a(4);
    }

    public final void b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final boolean c() {
        gig gigVar = this.q;
        return gigVar != null && gigVar.C(16) && this.q.isPlayingAd() && this.q.getPlayWhenReady();
    }

    public final void d(boolean z) {
        if (!(c() && this.A) && p()) {
            uig uigVar = this.k;
            boolean z2 = uigVar.g() && uigVar.t0 <= 0;
            boolean zH = h();
            if (z || z2 || zH) {
                i(zH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gig gigVar = this.q;
        if (gigVar != null && gigVar.C(16) && this.q.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        uig uigVar = this.k;
        if (z && p() && !uigVar.g()) {
            d(true);
            return true;
        }
        if ((p() && uigVar.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            d(true);
            return true;
        }
        if (z && p()) {
            d(true);
        }
        return false;
    }

    public final void e() {
        if (this.t != 0) {
            this.t = 0;
            n(false);
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.t == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.c != width) {
                    aspectRatioFrameLayout.c = width;
                    aspectRatioFrameLayout.requestLayout();
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0122, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.gig r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.g(gig):void");
    }

    public final boolean h() {
        gig gigVar = this.q;
        if (gigVar != null) {
            int playbackState = gigVar.getPlaybackState();
            if (!this.z) {
                return false;
            }
            if (this.q.C(17) && this.q.getCurrentTimeline().p()) {
                return false;
            }
            if (playbackState != 1 && playbackState != 4) {
                gig gigVar2 = this.q;
                gigVar2.getClass();
                if (gigVar2.getPlayWhenReady()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void i(boolean z) {
        if (p()) {
            int i = z ? 0 : this.y;
            uig uigVar = this.k;
            uigVar.t0 = i;
            zig zigVar = uigVar.a;
            if (uigVar.g()) {
                zigVar.f();
            }
            uig uigVar2 = zigVar.a;
            if (!uigVar2.i()) {
                uigVar2.setVisibility(0);
                uigVar2.k();
                ImageView imageView = uigVar2.u;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            zigVar.j();
        }
    }

    public final void j() {
        if (!p() || this.q == null) {
            return;
        }
        uig uigVar = this.k;
        if (!uigVar.g()) {
            d(true);
        } else if (this.B) {
            uigVar.d();
        }
    }

    public final void k() {
        gig gigVar = this.q;
        r4n r4nVarU = gigVar != null ? gigVar.U() : r4n.d;
        int i = r4nVarU.a;
        int i2 = r4nVarU.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * r4nVarU.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || aspectRatioFrameLayout.c == f) {
            return;
        }
        aspectRatioFrameLayout.c = f;
        aspectRatioFrameLayout.requestLayout();
    }

    public final void l() {
        int i;
        View view = this.i;
        if (view != null) {
            gig gigVar = this.q;
            view.setVisibility((gigVar != null && gigVar.getPlaybackState() == 2 && ((i = this.w) == 2 || (i == 1 && this.q.getPlayWhenReady()))) ? 0 : 8);
        }
    }

    public final void m() {
        uig uigVar = this.k;
        if (uigVar == null || !this.r) {
            setContentDescription(null);
        } else if (uigVar.g()) {
            setContentDescription(this.B ? getResources().getString(2132018921) : null);
        } else {
            setContentDescription(getResources().getString(2132018935));
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        gig gigVar = this.q;
        boolean zF = false;
        boolean z2 = (gigVar == null || !gigVar.C(30) || gigVar.w().a.isEmpty()) ? false : true;
        boolean z3 = this.x;
        ImageView imageView = this.g;
        View view = this.c;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            b();
        }
        if (z2) {
            gig gigVar2 = this.q;
            boolean z4 = gigVar2 != null && gigVar2.C(30) && gigVar2.w().a(2);
            boolean zA = a();
            if (!z4 && !zA) {
                if (view != null) {
                    view.setVisibility(0);
                }
                b();
            }
            ImageView imageView2 = this.f;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zA && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z4 && !zA && z5) {
                b();
            }
            if (!z4 && !zA && this.t != 0) {
                imageView.getClass();
                if (gigVar != null && gigVar.C(18) && (bArr = gigVar.q0().k) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.v)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.u == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null && aspectRatioFrameLayout.c != width) {
            aspectRatioFrameLayout.c = width;
            aspectRatioFrameLayout.requestLayout();
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.q == null) {
            return false;
        }
        d(true);
        return true;
    }

    public final boolean p() {
        if (!this.r) {
            return false;
        }
        this.k.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        j();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
