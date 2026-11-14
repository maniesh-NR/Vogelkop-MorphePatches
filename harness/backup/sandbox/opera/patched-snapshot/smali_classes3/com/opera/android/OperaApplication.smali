.class public Lcom/opera/android/OperaApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lgl5;
.implements Lxu2;
.implements Lhmc;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0007\u0008\t\nB\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/opera/android/OperaApplication;",
        "Landroid/app/Application;",
        "Lgl5;",
        "Lxu2;",
        "Lhmc;",
        "<init>",
        "()V",
        "vl9",
        "iif",
        "hz",
        "alo",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final K:[Ljava/lang/String;


# instance fields
.field public final A:Lj4c;

.field public final B:Lj4c;

.field public final C:Lj4c;

.field public final D:Lj4c;

.field public final E:Lj4c;

.field public final F:Lj4c;

.field public final G:Lj4c;

.field public final H:Lj4c;

.field public final I:Lj4c;

.field public final J:Lj4c;

.field public final a:Ljava/util/HashMap;

.field public b:Lsl6;

.field public final c:Ljava/lang/Object;

.field public d:Ltjg;

.field public final e:Ljava/lang/Object;

.field public final f:Lj4c;

.field public final g:Ljava/lang/Throwable;

.field public h:Ljava/lang/Integer;

.field public final i:Ldu1;

.field public j:Z

.field public k:Z

.field public l:Z

.field public final m:Lcbk;

.field public final n:Lorg/chromium/base/CommandLine;

.field public o:Z

.field public p:Lrr3;

.field public final q:Lzyk;

.field public final r:Lxv1;

.field public final s:Lj4c;

.field public final t:Lj4c;

.field public final u:Lt1;

.field public final v:Lj4c;

.field public final w:Lj4c;

.field public final x:Lj4c;

.field public final y:Lj4c;

.field public final z:Lg92;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v7, "virtualapp"

    const-string v8, "waxmoon"

    const-string v0, "dualaid"

    const-string v1, "dualspace"

    const-string v2, "excelliance"

    const-string v3, "gspace"

    const-string v4, "parallel_intl"

    const-string v5, "parallel_lite"

    const-string v6, "parallelspace"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/opera/android/OperaApplication;->K:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->c:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->e:Ljava/lang/Object;

    new-instance v0, Lkw3;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lkw3;-><init>(B)V

    new-instance v1, Lj4c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lj4c;-><init>(Lesk;B)V

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->f:Lj4c;

    new-instance v0, Lcbk;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->m:Lcbk;

    new-instance v0, Let3;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Let3;-><init>(Lcom/opera/android/OperaApplication;B)V

    invoke-static {v0}, Lz4c;->b(Lkotlin/jvm/functions/Function0;)Lzyk;

    move-result-object v0

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->q:Lzyk;

    new-instance v0, Lxv1;

    invoke-direct {v0, p0}, Lxv1;-><init>(Lcom/opera/android/OperaApplication;)V

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v1, v0, Lxv1;->z:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->s:Lj4c;

    iget-object v1, v0, Lxv1;->i:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->t:Lj4c;

    iget-object v1, v0, Lxv1;->x:Lt1;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->u:Lt1;

    iget-object v1, v0, Lxv1;->F:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->v:Lj4c;

    iget-object v1, v0, Lxv1;->J:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->w:Lj4c;

    iget-object v1, v0, Lxv1;->P:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->x:Lj4c;

    iget-object v1, v0, Lxv1;->Q:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->y:Lj4c;

    sget-object v1, Lpif;->b:Lpif;

    new-instance v2, Lg92;

    iget-object v3, v0, Lxv1;->W:Lj4c;

    invoke-direct {v2, v3, v1}, Lg92;-><init>(Lcom/opera/android/Lazy;Lkotlin/jvm/functions/Function1;)V

    iput-object v2, p0, Lcom/opera/android/OperaApplication;->z:Lg92;

    iget-object v1, v0, Lxv1;->i0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->A:Lj4c;

    iget-object v1, v0, Lxv1;->r0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->B:Lj4c;

    iget-object v1, v0, Lxv1;->s0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->C:Lj4c;

    iget-object v1, v0, Lxv1;->E0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->D:Lj4c;

    iget-object v1, v0, Lxv1;->F0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->E:Lj4c;

    iget-object v1, v0, Lxv1;->G0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->F:Lj4c;

    iget-object v1, v0, Lxv1;->H0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->G:Lj4c;

    iget-object v1, v0, Lxv1;->I0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->H:Lj4c;

    iget-object v1, v0, Lxv1;->W0:Lj4c;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->I:Lj4c;

    iget-object v0, v0, Lxv1;->p1:Lj4c;

    iput-object v0, p0, Lcom/opera/android/OperaApplication;->J:Lj4c;

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ldu1;->d:Ldu1;

    invoke-static {v0}, Lorg/chromium/base/CommandLine;->d([Ljava/lang/String;)V

    sget-object v2, Lorg/chromium/base/CommandLine;->d:Lorg/chromium/base/CommandLine;

    iput-object v2, p0, Lcom/opera/android/OperaApplication;->n:Lorg/chromium/base/CommandLine;

    const-string v3, "enable-crash-reporter"

    invoke-virtual {v2, v3, v0}, Lorg/chromium/base/CommandLine;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Locp;->k()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Landroid/webkit/WebView;->disableWebView()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->g:Ljava/lang/Throwable;

    :goto_0
    iput-object v0, p0, Lcom/opera/android/OperaApplication;->i:Ldu1;

    return-void
.end method


# virtual methods
.method public final A()Loue;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->e0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loue;

    return-object p0
.end method

.method public final B()Lqwe;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->g0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqwe;

    return-object p0
.end method

.method public final C()Lsdf;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->n0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsdf;

    return-object p0
.end method

.method public final D()Ljtg;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->t0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljtg;

    return-object p0
.end method

.method public final E()Lgmk;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->v0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgmk;

    return-object p0
.end method

.method public final F()Lcom/opera/android/PushedContentHandler;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->w0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/opera/android/PushedContentHandler;

    return-object p0
.end method

.method public final G()Lmdh;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->y0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmdh;

    return-object p0
.end method

.method public final H()Lglh;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->B0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lglh;

    return-object p0
.end method

.method public final I()Lq6e;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->O0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq6e;

    return-object p0
.end method

.method public final J()Lcom/opera/android/settings/SettingsManager;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->P0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/opera/android/settings/SettingsManager;

    return-object p0
.end method

.method public final K()Lr0k;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->V0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr0k;

    return-object p0
.end method

.method public final L()Ld6j;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->X0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld6j;

    return-object p0
.end method

.method public final M()Lslk;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->Y0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lslk;

    return-object p0
.end method

.method public final N()Lzwk;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->a1:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzwk;

    return-object p0
.end method

.method public final O()Lv3m;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->h1:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv3m;

    return-object p0
.end method

.method public final P()Lskm;
    .locals 0

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object p0

    iget-object p0, p0, Ld6j;->d:Lx5f;

    return-object p0
.end method

.method public final Q()Lorm;
    .locals 0

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object p0

    iget-object p0, p0, Ld6j;->c:Lx5f;

    return-object p0
.end method

.method public final R()Lydn;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->i1:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lydn;

    return-object p0
.end method

.method public final S()Lien;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->j1:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lien;

    return-object p0
.end method

.method public final T()Lyen;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->k1:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyen;

    return-object p0
.end method

.method public final U()Z
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->h:Ljava/lang/Integer;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final V()V
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/opera/android/OperaApplication;->j:Z

    if-nez v1, :cond_10

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/opera/android/OperaApplication;->j:Z

    sget-object v2, Ltz5;->a:Ljava/lang/Object;

    invoke-static {}, Locp;->k()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lvml;->d:Lumi;

    const-string v4, "crashhandler"

    new-instance v5, Lsz5;

    invoke-direct {v5, v3}, Lsz5;-><init>(B)V

    new-array v6, v1, [Lbg1;

    aput-object v5, v6, v3

    invoke-static {v0, v2, v4, v6}, Lw1h;->l(Landroid/content/Context;Ltcl;Ljava/lang/String;[Lbg1;)Lb59;

    move-result-object v2

    sget-object v4, Ltz5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Locp;->k()Z

    move-result v2

    invoke-static {}, Landroid/os/Process;->isIsolated()Z

    move-result v4

    new-instance v5, Lks3;

    const-string v6, "beta"

    const-string v7, "<unknown>"

    const-string v8, ""

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v9, Ljs3;

    invoke-direct {v9, v3}, Ljs3;-><init>(B)V

    invoke-static {v9}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    iput-object v9, v5, Lks3;->a:Ljava/lang/Object;

    new-instance v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v9, v5, Lks3;->f:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    iput-object v10, v5, Lks3;->b:Ljava/lang/Object;

    new-instance v10, Lcom/opera/android/crashhandler/OperaCrashKeys;

    invoke-direct {v10}, Lcom/opera/android/crashhandler/OperaCrashKeys;-><init>()V

    iput-object v10, v5, Lks3;->c:Ljava/lang/Object;

    if-eqz v2, :cond_1

    new-instance v11, Ll45;

    invoke-direct {v11, v0, v8}, Ll45;-><init>(Lcom/opera/android/OperaApplication;Ljava/lang/String;)V

    new-instance v12, Ll45;

    const-string v13, "info."

    invoke-direct {v12, v0, v13}, Ll45;-><init>(Lcom/opera/android/OperaApplication;Ljava/lang/String;)V

    iput-object v12, v5, Lks3;->h:Ljava/lang/Object;

    new-instance v12, Ll45;

    const-string v13, "uploader."

    invoke-direct {v12, v0, v13}, Ll45;-><init>(Lcom/opera/android/OperaApplication;Ljava/lang/String;)V

    iput-object v12, v5, Lks3;->i:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v11, Lwom;->Gp:Lauj;

    iput-object v11, v5, Lks3;->h:Ljava/lang/Object;

    iput-object v11, v5, Lks3;->i:Ljava/lang/Object;

    :goto_0
    const-string v12, "OperaMobile"

    const/4 v13, 0x7

    invoke-virtual {v10, v13, v12}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v13, 0x8

    invoke-virtual {v10, v13, v12}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    const-wide/16 v13, 0x0

    invoke-static {v0, v12, v13, v14}, Lr9n;->u(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object v12

    iget-object v12, v12, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const/16 v15, 0xa

    invoke-virtual {v10, v15, v12}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v15, 0x2f

    const-string v3, "1910404306"

    invoke-virtual {v10, v15, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    if-eqz v2, :cond_2

    const-string v3, "browser"

    goto :goto_1

    :cond_2
    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v3

    const-string v15, ":sandboxed_process"

    invoke-virtual {v3, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-eqz v15, :cond_3

    const-string v3, "renderer"

    goto :goto_1

    :cond_3
    const-string v15, ":privileged_process"

    invoke-virtual {v3, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-eqz v15, :cond_4

    const-string v3, "gpu-process"

    goto :goto_1

    :cond_4
    const/16 v15, 0x3a

    invoke-virtual {v3, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    if-ltz v15, :cond_5

    add-int/2addr v15, v1

    invoke-virtual {v3, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_5
    const-string v3, "other"

    :goto_1
    const/4 v15, 0x6

    invoke-virtual {v10, v15, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/4 v3, 0x5

    invoke-virtual {v10, v3, v6}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    const-wide/16 v18, 0x3e8

    div-long v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    const/16 v15, 0x9

    invoke-virtual {v10, v15, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v15, 0x7f14115c

    invoke-virtual {v3, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    const/4 v1, 0x3

    invoke-virtual {v10, v1, v15}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v1, v15}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v13, v14}, Lr9n;->u(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-nez v1, :cond_6

    move-object v1, v7

    goto :goto_2

    :cond_6
    iget-wide v13, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    div-long v13, v13, v18

    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    :goto_2
    const/4 v13, 0x4

    invoke-virtual {v10, v13, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0xb

    invoke-virtual {v10, v1, v12}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const v1, 0x7f14115d

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "0"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/16 v12, 0x11

    if-nez v3, :cond_7

    const/16 v3, 0xe

    invoke-virtual {v10, v3, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0xd

    const-string v3, "breakpad_symbols"

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0xc

    const-string v3, "proguard_maps_gp"

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    goto :goto_3

    :cond_7
    const/16 v1, 0x10

    const-string v3, "com.opera.browser.beta_armeabi-v7a_1910404306"

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const-string v1, "1"

    invoke-virtual {v10, v12, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0xf

    invoke-virtual {v10, v1, v8}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    :goto_3
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v10, v3, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0x16

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0x17

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x18

    invoke-virtual {v10, v3, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const/16 v1, 0x15

    sget-object v3, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v10, v1, v3}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    const-string v1, "armeabi-v7a"

    const/4 v3, 0x0

    invoke-virtual {v10, v3, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    sget-object v1, Lhs3;->a:Ln9a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ln9a;->n(Ljava/lang/String;)Lhs3;

    move-result-object v1

    invoke-virtual {v1, v0}, Lhs3;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x1c

    invoke-virtual {v10, v3, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    invoke-static {}, Li0l;->g()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    const-string v1, "ChromeOS"

    goto :goto_4

    :cond_8
    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_9

    const/16 v6, 0x21

    invoke-virtual {v10, v6, v1}, Lcom/opera/android/crashhandler/OperaCrashKeys;->a(ILjava/lang/String;)V

    :cond_9
    if-eqz v2, :cond_a

    new-instance v1, Lcom/opera/android/crashhandler/MainProcessCrashHandler;

    new-instance v6, Lis3;

    invoke-direct {v6, v5}, Lis3;-><init>(Lks3;)V

    invoke-direct {v1, v0, v11, v6, v5}, Lcom/opera/android/crashhandler/MainProcessCrashHandler;-><init>(Lcom/opera/android/OperaApplication;Lwom;Lis3;Lks3;)V

    goto :goto_5

    :cond_a
    new-instance v1, Ln9k;

    invoke-direct {v1, v5, v4}, Ln9k;-><init>(Ljava/lang/Object;Z)V

    :goto_5
    iput-object v1, v5, Lks3;->g:Ljava/lang/Object;

    if-eqz v2, :cond_b

    new-instance v1, Lldc;

    invoke-direct {v1, v10}, Lldc;-><init>(Lcom/opera/android/crashhandler/OperaCrashKeys;)V

    goto :goto_6

    :cond_b
    move-object v1, v3

    :goto_6
    iput-object v1, v5, Lks3;->d:Ljava/lang/Object;

    if-eqz v2, :cond_c

    new-instance v3, Lv61;

    invoke-direct {v3, v0}, Lv61;-><init>(Lcom/opera/android/OperaApplication;)V

    :cond_c
    iput-object v3, v5, Lks3;->e:Ljava/lang/Object;

    if-eqz v2, :cond_d

    new-instance v1, Lym8;

    invoke-direct {v1, v0}, Lym8;-><init>(Lcom/opera/android/OperaApplication;)V

    invoke-virtual {v9, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {v5, v7}, Lks3;->J(Ljava/lang/String;)V

    sput-object v5, Lks3;->k:Lks3;

    sget-object v1, Lks3;->k:Lks3;

    if-nez v4, :cond_e

    new-instance v2, Lsmb;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lsmb;-><init>(Lks3;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v2}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    new-instance v1, Lvk2;

    invoke-direct {v1, v12}, Lvk2;-><init>(B)V

    sget-object v2, Ly55;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sput-object v1, Ly55;->i:Lvk2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_e
    :goto_7
    invoke-static {}, Locp;->k()Z

    move-result v1

    if-eqz v1, :cond_10

    iget-boolean v1, v0, Lcom/opera/android/OperaApplication;->l:Z

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Lcom/opera/android/OperaApplication;->j:Z

    if-eqz v1, :cond_f

    invoke-static {v0}, Lb8h;->n(Lcom/opera/android/OperaApplication;)V

    :cond_f
    invoke-static {v0}, Lrog;->a(Landroid/content/Context;)V

    :cond_10
    return-void
.end method

.method public final W(Landroid/app/Activity;)V
    .locals 27

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v1

    const-string v2, "eula_accepted.gdpr"

    invoke-virtual {v1, v2}, Lcom/opera/android/settings/SettingsManager;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    const-class v1, Landroid/app/NotificationManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    invoke-virtual {v1}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    move-result v1

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->q()Le59;

    move-result-object v2

    sget-object v3, Ld59;->d:Ld59;

    invoke-virtual {v2, v3, v1}, Le59;->c(Ld59;Z)V

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->u()Lm9c;

    move-result-object v2

    iget-object v4, v2, Lm9c;->b:Lb59;

    invoke-virtual {v4}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/SharedPreferences;

    const-string v5, "min_interval"

    const/4 v6, 0x0

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    const/4 v10, 0x1

    if-ltz v9, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-object v2, v2, Lm9c;->b:Lb59;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences;

    const-string v9, "last_launch"

    invoke-interface {v2, v9, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    cmp-long v2, v11, v7

    if-ltz v2, :cond_1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    add-long/2addr v4, v7

    cmp-long v2, v11, v4

    if-gez v2, :cond_1

    :cond_0
    move v2, v6

    goto :goto_0

    :cond_1
    move v2, v10

    :goto_0
    if-nez v2, :cond_2

    sput-boolean v10, Lcom/leanplum/internal/Constants;->isInPermanentFailureState:Z

    :cond_2
    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->u()Lm9c;

    move-result-object v4

    invoke-virtual {v4}, Lm9c;->b()Ljava/lang/String;

    move-result-object v5

    iget-object v7, v4, Lm9c;->b:Lb59;

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->t()Lr9c;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Li0l;->h(Landroid/content/Context;)Lcom/opera/android/Lazy;

    move-result-object v9

    invoke-virtual {v9}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v7}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/SharedPreferences;

    const-string v12, "endpoint_override_hostname_new"

    const-string v13, ""

    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/content/SharedPreferences;

    const-string v15, "endpoint_override_path_new"

    invoke-interface {v14, v15, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->i()Ljk5;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljk5;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lm9c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Landroid/content/SharedPreferences;

    move/from16 v16, v1

    const-string v1, "ab_group"

    move/from16 v18, v2

    const/4 v2, 0x0

    invoke-interface {v6, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/SharedPreferences;

    const-string v2, "premium"

    move-object/from16 v19, v7

    const/4 v7, 0x0

    invoke-interface {v6, v2, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v7

    invoke-virtual/range {v19 .. v19}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v2

    move-object/from16 v2, v20

    check-cast v2, Landroid/content/SharedPreferences;

    move/from16 v20, v6

    const-string v6, "huid"

    move-object/from16 v22, v9

    const/4 v9, 0x0

    invoke-interface {v2, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lzi4;->A(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    iget-boolean v9, v8, Lr9c;->a:Z

    if-nez v9, :cond_12

    const/4 v9, 0x1

    iput-boolean v9, v8, Lr9c;->a:Z

    invoke-static {v0}, Lcom/leanplum/LeanplumActivityHelper;->enableLifecycleCallbacks(Landroid/app/Application;)V

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_3

    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_3

    invoke-static {v11, v14, v9}, Lcom/leanplum/Leanplum;->setApiConnectionSettings(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v9, "invalid"

    const/16 v11, 0x50

    invoke-static {v9, v11}, Lcom/leanplum/Leanplum;->setSocketConnectionSettings(Ljava/lang/String;I)V

    :cond_3
    invoke-static {}, Lcom/leanplum/Leanplum;->disableLocationCollection()V

    invoke-static {v5}, Lcom/leanplum/Leanplum;->setDeviceId(Ljava/lang/String;)V

    invoke-static/range {v22 .. v22}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-static/range {v22 .. v22}, Lcom/leanplum/Leanplum;->setCountry(Ljava/lang/String;)V

    :cond_4
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5

    const-string v9, "configBundle"

    invoke-static {v9, v10}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    if-eqz v20, :cond_6

    move-object/from16 v9, v21

    goto :goto_1

    :cond_6
    const-string v9, "free"

    :goto_1
    const-string v10, "plan"

    invoke-static {v10, v9}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_7

    const-string v9, "adSet"

    invoke-static {v9, v4}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "abGroup"

    invoke-static {v4, v1}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "hashedOperaId"

    invoke-static {v1, v2}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "hashedAndroidId"

    invoke-static {v1, v6}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    const-string v1, "app_sxoB1f2yjpKREigcunDkrki2Lxy1KG5wdgEe6QsHmnk"

    const-string v2, "prod_F33BRKK2F7cswUGZNCOuhQ2sgczda85eiFi2v3Febu8"

    invoke-static {v1, v2}, Lcom/leanplum/Leanplum;->setAppIdForProductionMode(Ljava/lang/String;Ljava/lang/String;)V

    const-class v1, Lcom/opera/android/BrowserActivity;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/leanplum/DeferredActivitiesStrategy$WhitelistStrategy;->create([Ljava/lang/Class;)Lcom/leanplum/DeferredActivitiesStrategy$WhitelistStrategy;

    move-result-object v1

    invoke-static {v1}, Lcom/leanplum/LeanplumActivityHelper;->setDeferredActivitiesStrategy(Lcom/leanplum/DeferredActivitiesStrategy;)V

    const/16 v17, 0x1

    invoke-static/range {v17 .. v17}, Lcom/leanplum/Leanplum;->setEnableMultipleInAppsWithPriorityZero(Z)V

    sget-object v1, Lxsk;->c:Ldpj;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lxsk;->g:Lh58;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lz4;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lxsk;

    iget-object v6, v6, Lxsk;->b:Ljava/lang/String;

    invoke-virtual {v7, v6}, Lcom/opera/android/settings/SettingsManager;->i(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    new-instance v1, Lr4k;

    const/16 v4, 0x19

    invoke-direct {v1, v4}, Lr4k;-><init>(B)V

    const/16 v26, 0x1e

    const-string v21, ","

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v1

    move-object/from16 v20, v2

    invoke-static/range {v20 .. v26}, Lkotlin/collections/CollectionsKt;->P(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;ILkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "inappCategoriesDisabled"

    invoke-static {v2, v1}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "inappCategoriesSupported"

    sget-object v2, Lxsk;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/leanplum/Leanplum;->setCustomParam(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Lwub;

    invoke-direct {v1, v7}, Lwub;-><init>(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/leanplum/LeanplumMessageDisplayControllers;->setMessageDisplayController(Lcom/leanplum/MessageDisplayController;)V

    if-nez p1, :cond_d

    move-object v1, v0

    goto :goto_3

    :cond_d
    move-object/from16 v1, p1

    :goto_3
    iget-object v2, v8, Lr9c;->b:Ljava/util/HashMap;

    invoke-static {v1, v5, v2}, Lcom/leanplum/Leanplum;->start(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/leanplum/messagetemplates/OperaAlert;->register(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/leanplum/messagetemplates/OperaConfirm;->register(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/leanplum/messagetemplates/OperaSheet;->register(Landroid/content/Context;)V

    sget-object v1, Lcom/leanplum/messagetemplates/OperaWallpaperSheet;->INSTANCE:Lcom/leanplum/messagetemplates/OperaWallpaperSheet;

    sget-object v2, Lvml;->d:Lumi;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    check-cast v4, Lcom/opera/android/OperaApplication;

    invoke-virtual {v4}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v4

    iget-object v4, v4, Ld6j;->c:Lx5f;

    invoke-virtual {v1, v2, v4}, Lcom/leanplum/messagetemplates/OperaWallpaperSheet;->register(Ltcl;Lorm;)V

    sget-object v1, Lcom/leanplum/messagetemplates/OperaConfigBundleSheet;->INSTANCE:Lcom/leanplum/messagetemplates/OperaConfigBundleSheet;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    check-cast v4, Lcom/opera/android/OperaApplication;

    invoke-virtual {v4}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v4

    iget-object v4, v4, Ld6j;->c:Lx5f;

    invoke-virtual {v1, v2, v4}, Lcom/leanplum/messagetemplates/OperaConfigBundleSheet;->register(Ltcl;Lorm;)V

    invoke-static {v0, v2}, Lcom/leanplum/messagetemplates/OperaSubscriptionSheet;->register(Landroid/content/Context;Ltcl;)V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/opera/android/OperaApplication;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v1

    iget-object v1, v1, Ld6j;->c:Lx5f;

    invoke-static {v1}, Lcom/leanplum/messagetemplates/OperaRateSheet;->register(Lorm;)V

    invoke-static {v0, v2}, Lcom/leanplum/messagetemplates/OperaSubscriptionDialog;->register(Landroid/content/Context;Ltcl;)V

    new-instance v1, Lcom/leanplum/messagetemplates/OperaOpenUrlAction;

    new-instance v2, Lv9c;

    const/4 v7, 0x0

    invoke-direct {v2, v0, v7}, Lv9c;-><init>(Lcom/opera/android/OperaApplication;B)V

    new-instance v4, Lu9c;

    invoke-direct {v4, v0}, Lu9c;-><init>(Lcom/opera/android/OperaApplication;)V

    new-instance v6, Lv9c;

    const/4 v9, 0x1

    invoke-direct {v6, v0, v9}, Lv9c;-><init>(Lcom/opera/android/OperaApplication;B)V

    new-instance v8, Lv9c;

    const/4 v10, 0x2

    invoke-direct {v8, v0, v10}, Lv9c;-><init>(Lcom/opera/android/OperaApplication;B)V

    const/4 v11, 0x4

    new-array v11, v11, [Lcom/leanplum/callbacks/ActionCallback;

    aput-object v2, v11, v7

    aput-object v4, v11, v9

    aput-object v6, v11, v10

    const/4 v2, 0x3

    aput-object v8, v11, v2

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/leanplum/messagetemplates/OperaOpenUrlAction;-><init>(Ljava/util/List;)V

    invoke-static {v1, v0}, Lcom/leanplum/messagetemplates/MessageTemplates;->registerAction(Lcom/leanplum/messagetemplates/MessageTemplate;Landroid/content/Context;)V

    invoke-virtual/range {v19 .. v19}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/SharedPreferences;

    const-string v2, "endpoint_override_hostname_current"

    invoke-interface {v1, v2, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v6, "endpoint_override_path_current"

    invoke-interface {v1, v6, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v15, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v4, :cond_e

    if-nez v1, :cond_f

    :cond_e
    move v7, v9

    :cond_f
    if-eqz v7, :cond_11

    if-eqz v16, :cond_10

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->q()Le59;

    move-result-object v1

    invoke-virtual {v1, v3}, Le59;->b(Ld59;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/leanplum/OperaLeanplumHelper;->setRegistrationId(Ljava/lang/String;)V

    :cond_10
    invoke-virtual/range {v19 .. v19}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v1, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v1, v15, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_11
    new-instance v1, Ldac;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Ldac;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v0

    iget-object v0, v0, Ld6j;->d:Lx5f;

    iget-object v1, v0, Lx5f;->d:Lzpa;

    invoke-static {}, Lzpa;->F()Lx56;

    move-result-object v2

    invoke-virtual {v2, v1}, Lx56;->D(Lzpa;)Ltf0;

    move-result-object v1

    const/4 v3, 0x7

    invoke-virtual {v1, v3, v5}, Ltf0;->x(ILjava/lang/String;)V

    invoke-virtual {v0, v2}, Lx5f;->U0(Lx56;)V

    if-nez v18, :cond_12

    invoke-static {}, Lcom/leanplum/internal/LeanplumInternal;->triggerStartIssued()V

    :cond_12
    return-void
.end method

.method public final a()Z
    .locals 5

    const/4 v0, 0x1

    return v0

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v0

    const-string v1, "eula_accepted.gdpr"

    invoke-virtual {v0, v1}, Lcom/opera/android/settings/SettingsManager;->i(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->C()Lsdf;

    move-result-object v0

    iget-object v2, v0, Lsdf;->d:Lr65;

    invoke-virtual {v2}, Lr65;->m()Z

    move-result v2

    const-string v3, "pushed.sequence"

    const/4 v4, 0x1

    if-nez v2, :cond_0

    iget-object v2, v0, Lsdf;->b:Ludf;

    iget-object v2, v2, Ludf;->a:Lb59;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences;

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-lt v2, v4, :cond_3

    invoke-virtual {v0}, Lsdf;->a()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v2, v0, Lxv1;->x0:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpch;

    iget-object v2, v2, Lpch;->a:Ludf;

    iget-object v2, v2, Ludf;->a:Lb59;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences;

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    iget-object v0, v0, Lxv1;->m0:Lj4c;

    invoke-virtual {v0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lldf;

    iget-object v0, v0, Lldf;->a:Lb59;

    invoke-virtual {v0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const-string v2, "need"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->h()Lr65;

    move-result-object v0

    invoke-virtual {v0}, Lr65;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v0

    const-string v2, "has_waited_for_startup_dependencies"

    invoke-virtual {v0, v2}, Lcom/opera/android/settings/SettingsManager;->i(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/opera/android/settings/SettingsManager;->J()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-static {p0}, Lru9;->c(Landroid/content/Context;)Lru9;

    move-result-object p0

    iget-object p0, p0, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v0, "personalization.onboarding.completed"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_3

    return v4

    :cond_3
    return v1
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Locp;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lwwc;->g(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lwwc;->h(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;

    move-result-object p1

    :cond_0
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    sget-object p1, Lz5i;->r:[Ljava/lang/String;

    sput-object p1, Lorg/chromium/ui/base/ResourceBundle;->a:[Ljava/lang/String;

    sput-object p0, Lt8;->a:Landroid/content/Context;

    invoke-static {}, Locp;->k()Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    sget-object p1, Lcjf;->a:Li06;

    sput-object p1, Lp37;->h:Li06;

    sget-object p1, Lwbc;->g:Lwbc;

    invoke-virtual {p1, v1}, Lwbc;->e(I)V

    :cond_1
    invoke-static {}, Locp;->k()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0, v0}, Ln0k;->d(Landroid/content/Context;Z)Z

    iput-boolean v1, p0, Lcom/opera/android/OperaApplication;->l:Z

    iget-boolean p1, p0, Lcom/opera/android/OperaApplication;->j:Z

    if-eqz p1, :cond_2

    invoke-static {p0}, Lb8h;->n(Lcom/opera/android/OperaApplication;)V

    :cond_2
    return-void

    :cond_3
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    const-string p0, "System.exit returned normally, while it was supposed to halt JVM."

    invoke-static {p0}, Lh9o;->r(Ljava/lang/String;)V

    return-void
.end method

.method public final b()Ldb;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->b:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldb;

    return-object p0
.end method

.method public final bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    if-ne p2, p3, :cond_0

    const-string p2, "com.google.android.c2dm.intent.REGISTER"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    throw p0
.end method

.method public final c()Lxb;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->d:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxb;

    return-object p0
.end method

.method public final d()Le00;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->e:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le00;

    return-object p0
.end method

.method public final e()Lj4c;
    .locals 2

    sget-object v0, Lmv0;->l:Lio7;

    sget-object v1, Lmv0;->n:Lt40;

    invoke-static {p0, v0, v1}, Lno7;->n(Landroid/content/Context;Lio7;Llo7;)Lno7;

    move-result-object v0

    check-cast v0, Lmv0;

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->g:Lj4c;

    return-object p0
.end method

.method public final f()Lvu2;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->l:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvu2;

    return-object p0
.end method

.method public final g()Li53;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->q:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li53;

    return-object p0
.end method

.method public final getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lcom/opera/android/OperaApplication;->a:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/opera/android/OperaApplication;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    new-instance v1, Liif;

    invoke-super {p0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-direct {v1, p2}, Liif;-><init>(Landroid/content/SharedPreferences;)V

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->a:Ljava/util/HashMap;

    invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 18

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_3

    const-string v0, "display_hash"

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-super/range {p0 .. p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/displayhash/DisplayHashManager;

    :try_start_0
    invoke-virtual {v0}, Landroid/view/displayhash/DisplayHashManager;->getSupportedHashAlgorithms()Ljava/util/Set;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    sget-wide v3, Luaa;->c:J

    sget-object v5, Luaa;->a:Lsun/misc/Unsafe;

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-nez v6, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-nez v6, :cond_0

    :try_start_1
    const-class v6, Lcom/opera/android/utilities/HiddenApis$Helper$NeverCall;

    const-string v9, "s"

    invoke-virtual {v6, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v11
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    sget-wide v9, Luaa;->d:J

    invoke-virtual {v5, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v9

    const-wide/16 v12, 0x0

    cmp-long v1, v9, v12

    if-eqz v1, :cond_0

    invoke-virtual {v5, v9, v10}, Lsun/misc/Unsafe;->getInt(J)I

    move-result v1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_0

    int-to-long v12, v6

    sget-wide v14, Luaa;->f:J

    mul-long/2addr v12, v14

    add-long/2addr v12, v9

    sget-wide v14, Luaa;->g:J

    add-long/2addr v14, v12

    move-wide v12, v9

    sget-object v10, Luaa;->a:Lsun/misc/Unsafe;

    move-wide/from16 v16, v12

    sget-wide v12, Luaa;->b:J

    invoke-virtual/range {v10 .. v15}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    invoke-virtual {v10, v11, v3, v4, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :try_start_2
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/invoke/MethodHandles$Lookup;->revealDirect(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    invoke-virtual {v5, v11, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/invoke/MethodHandleInfo;

    sget-wide v12, Luaa;->e:J

    invoke-virtual {v5, v9, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/reflect/Field;

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v12, "sSupportedHashAlgorithms"

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v9, v16

    goto :goto_0

    :catch_1
    :cond_0
    move-object v9, v8

    :cond_1
    if-eqz v9, :cond_2

    :try_start_3
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v9, v8, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_2
    return-object v0

    :cond_3
    move-object/from16 v1, p1

    :cond_4
    invoke-super/range {p0 .. p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lr65;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->t:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr65;

    return-object p0
.end method

.method public final i()Ljk5;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->v:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljk5;

    return-object p0
.end method

.method public final j()Lku5;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->w:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lku5;

    return-object p0
.end method

.method public final k()Lsl6;
    .locals 2

    iget-object v0, p0, Lcom/opera/android/OperaApplication;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/opera/android/OperaApplication;->b:Lsl6;

    if-nez v1, :cond_0

    new-instance v1, Lsl6;

    invoke-direct {v1, p0}, Lsl6;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->b:Lsl6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final l()Lgc7;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->A:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgc7;

    return-object p0
.end method

.method public final m()Lsf7;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->C:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsf7;

    return-object p0
.end method

.method public final n()Lag7;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->D:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lag7;

    return-object p0
.end method

.method public final o()Lnr8;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->H:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnr8;

    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    invoke-static {}, Locp;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lwwc;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwwc;->f(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {p0, v0}, Lwwc;->a(Landroid/content/ContextWrapper;Ljava/util/Locale;)V

    sget-object v0, Lvml;->d:Lumi;

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lwwc;->a:Ljava/util/Locale;

    :cond_0
    new-instance v3, Lrml;

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-direct {v3, v4, v0}, Lrml;-><init>(Ljava/lang/Object;Ltcl;)V

    new-instance v0, Lv2e;

    const/4 v4, 0x5

    invoke-direct {v0, v4, v1, p0, v2}, Lv2e;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v3, v0}, Lrml;->a(Lkotlin/jvm/functions/Function1;)Lplk;

    move-result-object v0

    invoke-virtual {v0}, Lplk;->l()Loml;

    :cond_1
    iget-object v0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v0, v0, Lxv1;->c1:Lj4c;

    invoke-virtual {v0}, Lcom/opera/android/Lazy;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnzk;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lnzk;->a(Landroid/content/res/Configuration;)V

    :cond_2
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final onCreate()V
    .locals 33

    move-object/from16 v1, p0

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->V()V

    iget-object v0, v1, Lcom/opera/android/OperaApplication;->g:Ljava/lang/Throwable;

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lks3;->D(Ljava/lang/Throwable;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/opera/android/OperaApplication;->h:Ljava/lang/Integer;

    :cond_0
    const-string v0, "slf4j.provider"

    const-string v2, "org.slf4j.nop.NOPServiceProvider"

    invoke-static {v0, v2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-super {v1}, Landroid/app/Application;->onCreate()V

    invoke-static {}, Locp;->k()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/16 v10, 0x9

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0c0080

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/opera/android/OperaApplication;->K:[Ljava/lang/String;

    move v3, v6

    :goto_0
    if-ge v3, v10, :cond_1

    aget-object v4, v2, v3

    invoke-static {v0, v4, v6}, Lkotlin/text/StringsKt;->E(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lr9n;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    move v3, v6

    :goto_1
    if-ge v3, v10, :cond_5

    aget-object v4, v2, v3

    invoke-static {v0, v4, v6}, Lkotlin/text/StringsKt;->E(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/opera/android/OperaApplication;->h:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/opera/android/OperaApplication;->h:Ljava/lang/Integer;

    goto :goto_2

    :cond_4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/opera/android/OperaApplication;->h:Ljava/lang/Integer;

    :cond_5
    :goto_2
    iget-object v0, v1, Lcom/opera/android/OperaApplication;->u:Lt1;

    sput-object v0, Lcom/opera/android/utilities/CryptoBridge;->a:Lt1;

    new-instance v0, Lj06;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lj06;-><init>(B)V

    sput-object v0, Ll2c;->j:Lc2c;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcqp;->m:Landroid/content/Context;

    new-instance v0, Lii;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lii;-><init>(B)V

    sput-object v0, Lcqp;->n:Lii;

    new-instance v0, Lwne;

    invoke-direct {v0}, Lwne;-><init>()V

    invoke-static {v0}, Ljava/net/ProxySelector;->setDefault(Ljava/net/ProxySelector;)V

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->t()Lr9c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x1

    sput-boolean v11, Lcom/leanplum/internal/Constants;->disableFcmTokenAutoRefresh:Z

    sput-boolean v11, Lcom/leanplum/internal/Constants;->allowStorageWithoutLegacyToken:Z

    invoke-static {v1}, Lcom/leanplum/Leanplum;->setApplicationContext(Landroid/content/Context;)V

    new-instance v0, Lz9c;

    invoke-direct {v0, v1}, Lz9c;-><init>(Lcom/opera/android/OperaApplication;)V

    new-instance v2, Lk5o;

    new-instance v3, La36;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-array v4, v8, [Lw9c;

    aput-object v3, v4, v6

    aput-object v0, v4, v11

    invoke-direct {v2, v1, v4}, Lk5o;-><init>(Lcom/opera/android/OperaApplication;[Lw9c;)V

    invoke-static {v2}, Lcom/leanplum/LeanplumPushService;->setCustomizer(Lcom/leanplum/LeanplumPushNotificationCustomizer;)V

    const-class v2, Lcom/opera/android/BrowserActivity;

    invoke-static {v2}, Lcom/leanplum/LeanplumPushService;->setDefaultCallbackClass(Ljava/lang/Class;)V

    new-instance v2, Lhr5;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v2}, Lcom/leanplum/LeanplumPushService;->setDeeplinkIntentCustomizer(Lcom/leanplum/DeeplinkIntentCustomizer;)V

    new-instance v2, Lyzb;

    invoke-direct {v2, v0, v8}, Lyzb;-><init>(Ljava/lang/Object;B)V

    invoke-static {v2}, Lcom/leanplum/LeanplumPushService;->setOnPushNotificationOpenedCallback(Lcom/leanplum/LeanplumOnPushOpenedCallback;)V

    sget-object v0, Lyjf;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v2, Lqg2;

    const/16 v12, 0x8

    invoke-direct {v2, v12}, Lqg2;-><init>(B)V

    invoke-interface {v0, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    const-string v0, "leanplum"

    invoke-static {v0}, Lcom/leanplum/LeanplumPushService;->setDefaultNotificationTag(Ljava/lang/String;)V

    const-string v0, "opera"

    sget-object v2, Lorg/chromium/base/PathUtils;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    if-nez v2, :cond_6

    sput-object v0, Lorg/chromium/base/PathUtils;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v2, La94;

    invoke-direct {v2, v11}, La94;-><init>(B)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    sput-object v0, Lorg/chromium/base/PathUtils;->b:Ljava/util/concurrent/FutureTask;

    sget-object v0, Lfe2;->e:Lde2;

    sget-object v2, Lorg/chromium/base/PathUtils;->b:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, v2}, Lde2;->r(Ljava/lang/Runnable;)V

    :cond_6
    sget-object v15, Lvml;->d:Lumi;

    sget-object v0, Lpd6;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    const/4 v2, 0x5

    const/4 v3, 0x0

    if-nez v0, :cond_7

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v4, Ljava/util/concurrent/FutureTask;

    new-instance v5, Lce2;

    invoke-direct {v5, v0, v11}, Lce2;-><init>(Ljava/lang/Object;B)V

    invoke-direct {v4, v5}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    sput-object v4, Lpd6;->a:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqj;

    invoke-direct {v0, v4, v2}, Lqj;-><init>(Ljava/lang/Runnable;B)V

    new-instance v4, Lnml;

    iget-object v5, v15, Lumi;->c:Ldhi;

    invoke-direct {v4, v15, v0, v5}, Lnml;-><init>(Lumi;Ln5o;Lrmi;)V

    invoke-virtual {v4, v3}, Lnml;->a(Ljava/lang/Object;)Loml;

    :cond_7
    iget-object v0, v1, Lcom/opera/android/OperaApplication;->i:Ldu1;

    if-eqz v0, :cond_8

    const-string v4, "startup#core"

    invoke-virtual {v0, v4}, Ldu1;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    new-instance v16, Lrr3;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v20

    const/16 v17, 0x3

    invoke-direct/range {v16 .. v21}, Lrr3;-><init>(BJJ)V

    move-object/from16 v0, v16

    iput-object v0, v1, Lcom/opera/android/OperaApplication;->p:Lrr3;

    :cond_8
    invoke-static {v1}, Lwwc;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwwc;->f(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v1, v0}, Lwwc;->a(Landroid/content/ContextWrapper;Ljava/util/Locale;)V

    sget-object v0, Lwwc;->a:Ljava/util/Locale;

    new-instance v4, Lrml;

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-direct {v4, v5, v15}, Lrml;-><init>(Ljava/lang/Object;Ltcl;)V

    new-instance v5, Lv2e;

    invoke-direct {v5, v2, v0, v1, v11}, Lv2e;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v4, v5}, Lrml;->a(Lkotlin/jvm/functions/Function1;)Lplk;

    move-result-object v4

    invoke-virtual {v4}, Lplk;->l()Loml;

    sget-object v4, Lh11;->j:Lh11;

    new-instance v5, Lc30;

    sget-object v13, Lhs3;->a:Ln9a;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ln9a;->t(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v5, v2, v13, v6}, Lc30;-><init>(BLjava/lang/String;Z)V

    new-instance v13, Lkif;

    invoke-direct {v13, v1, v6}, Lkif;-><init>(Lcom/opera/android/OperaApplication;B)V

    sget v14, Llif;->a:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v0, La5f;->c:Ljava/util/Locale;

    sput-object v5, La5f;->d:Lc30;

    sget-object v0, Llkk;->b:Llkk;

    invoke-virtual {v4, v0, v13, v15}, Lz43;->m(Llkk;Lcom/opera/api/Callback;Lumi;)V

    sget-object v0, Laxh;->j:Laxh;

    new-instance v5, Lhr5;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v13, Lkif;

    invoke-direct {v13, v1, v11}, Lkif;-><init>(Lcom/opera/android/OperaApplication;B)V

    sget v14, Lmif;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v5, Lwu5;->a:Lhr5;

    sget-object v5, Llkk;->c:Llkk;

    invoke-virtual {v0, v5, v13, v15}, Lz43;->m(Llkk;Lcom/opera/api/Callback;Lumi;)V

    sget-object v5, Ltc3;->j:Ltc3;

    new-instance v13, Ls16;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v14, Lkif;

    invoke-direct {v14, v1, v8}, Lkif;-><init>(Lcom/opera/android/OperaApplication;B)V

    sget v16, Lnif;->a:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v13, Lqsf;->a:Ls16;

    sget-object v13, Llkk;->d:Llkk;

    invoke-virtual {v5, v13, v14, v15}, Lz43;->m(Llkk;Lcom/opera/api/Callback;Lumi;)V

    sget-object v13, Lcef;->j:Lcef;

    new-instance v14, Lb30;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v22, v4

    const-wide/16 v3, 0x0

    invoke-static {v1, v10, v3, v4}, Lr9n;->u(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object v10

    iget-object v10, v10, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sget-object v16, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-direct {v14, v10, v9}, Lb30;-><init>(Ljava/lang/String;B)V

    new-instance v10, Lkif;

    invoke-direct {v10, v1, v9}, Lkif;-><init>(Lcom/opera/android/OperaApplication;B)V

    sget v16, Loif;->a:I

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sput-object v14, Lir5;->b:Lb30;

    sget-object v14, Llkk;->e:Llkk;

    invoke-virtual {v13, v14, v10, v15}, Lz43;->m(Llkk;Lcom/opera/api/Callback;Lumi;)V

    new-instance v10, La36;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v14, Lkif;

    invoke-direct {v14, v1, v7}, Lkif;-><init>(Lcom/opera/android/OperaApplication;B)V

    sget v16, Ljif;->a:I

    sget-object v16, Lbe7;->j:Lbe7;

    sput-object v10, Lhr5;->a:La36;

    sget-object v10, Lbe7;->j:Lbe7;

    move/from16 v23, v7

    sget-object v7, Llkk;->f:Llkk;

    invoke-virtual {v10, v7, v14, v15}, Lz43;->m(Llkk;Lcom/opera/api/Callback;Lumi;)V

    sget-object v7, Lcak;->d:Lavj;

    new-instance v7, Lr99;

    invoke-direct {v7, v1, v9}, Lr99;-><init>(Lcom/opera/android/OperaApplication;B)V

    invoke-static {v2, v7}, Lavj;->g(ILjava/lang/Runnable;)V

    sget-object v7, Lorg/chromium/base/ApplicationStatus;->a:Ljava/util/HashMap;

    monitor-enter v7

    :try_start_1
    sput-byte v23, Lorg/chromium/base/ApplicationStatus;->c:B

    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v7, Lyv1;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-static {v7}, Lorg/chromium/base/ApplicationStatus;->g(Lgw1;)V

    new-instance v7, Lzv1;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v7}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    sput-object v1, Lorg/jetbrains/compose/resources/AndroidContextProvider;->a:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->U()Z

    move-result v7

    if-nez v7, :cond_1d

    invoke-static {v1}, Lu59;->C(Landroid/content/Context;)Lu59;

    move-result-object v7

    sget-object v14, Li0l;->b:Lnx1;

    const-string v14, "sys_utils"

    new-array v9, v6, [Lbg1;

    invoke-static {v1, v15, v14, v9}, Lw1h;->l(Landroid/content/Context;Ltcl;Ljava/lang/String;[Lbg1;)Lb59;

    iget-object v9, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v14, v9, Lxv1;->n1:Lj4c;

    invoke-virtual {v14}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    iget-object v14, v9, Lxv1;->V:Lj4c;

    invoke-virtual {v14}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    const-string v14, "__leanplum__"

    new-array v12, v6, [Lbg1;

    invoke-static {v1, v15, v14, v12}, Lw1h;->l(Landroid/content/Context;Ltcl;Ljava/lang/String;[Lbg1;)Lb59;

    sget-object v12, Lhe2;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v14, Lr99;

    invoke-direct {v14, v1, v8}, Lr99;-><init>(Lcom/opera/android/OperaApplication;B)V

    invoke-virtual {v12, v14}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    iget-object v12, v9, Lxv1;->N:Lj4c;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12, v15}, Lcom/opera/android/Lazy;->e(Lcom/opera/android/Lazy;Lumi;)V

    iget-object v12, v9, Lxv1;->t:Lj4c;

    invoke-virtual {v12}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    iget-object v12, v9, Lxv1;->n0:Lj4c;

    invoke-virtual {v12}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    iget-object v12, v9, Lxv1;->x0:Lj4c;

    invoke-virtual {v12}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    iget-object v9, v9, Lxv1;->m0:Lj4c;

    invoke-virtual {v9}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v9

    const-string v12, "version_code"

    invoke-virtual {v9, v12}, Lcom/opera/android/settings/SettingsManager;->n(Ljava/lang/String;)I

    move-result v9

    if-lez v9, :cond_9

    const v12, 0x71de6fb8

    if-ge v9, v12, :cond_9

    invoke-static {v1}, Lru9;->c(Landroid/content/Context;)Lru9;

    move-result-object v9

    iget-object v9, v9, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v12, "oem.onboarding.completed"

    invoke-interface {v9, v12, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-static {v1}, Lru9;->c(Landroid/content/Context;)Lru9;

    move-result-object v9

    invoke-virtual {v9}, Lru9;->b()Lnv6;

    move-result-object v9

    iget-object v12, v9, Lnv6;->a:Ljava/lang/Object;

    check-cast v12, Landroid/content/SharedPreferences$Editor;

    const-string v14, "personalization.onboarding.completed"

    invoke-interface {v12, v14, v11}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-virtual {v9}, Lnv6;->w()V

    :cond_9
    sget-object v9, Lwjf;->a:Ljava/util/List;

    sput-object v9, Lorg/chromium/components/cached_flags/CachedFlagUtils;->a:Ljava/util/List;

    sget-object v9, Lwjf;->b:Ljava/util/List;

    sput-object v9, Lorg/chromium/components/cached_flags/CachedFlagUtils;->b:Ljava/util/List;

    iget-object v9, v1, Lcom/opera/android/OperaApplication;->n:Lorg/chromium/base/CommandLine;

    if-nez v9, :cond_a

    const/4 v9, 0x0

    :cond_a
    sget-boolean v12, Lej9;->c:Z

    if-nez v12, :cond_b

    sput-boolean v11, Lej9;->c:Z

    sget-object v12, Lej9;->b:Lii;

    new-instance v14, La00;

    invoke-direct {v14, v9, v8}, La00;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v12, v14}, Lcom/opera/android/Lazy;->a(Lbg1;)V

    sget-object v9, Lej9;->a:Lii;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9, v15}, Lcom/opera/android/Lazy;->e(Lcom/opera/android/Lazy;Lumi;)V

    :cond_b
    iget-object v9, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v9, v9, Lxv1;->O:Lj4c;

    invoke-virtual {v9}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    invoke-virtual {v7}, Lu59;->L()Lt59;

    move-result-object v9

    if-nez v9, :cond_d

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9, v3, v4}, Lr9n;->u(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object v9

    iget-wide v8, v9, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v27

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v1, v14, v3, v4}, Lr9n;->u(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    new-instance v24, Lt59;

    move-object/from16 v29, v3

    move-wide/from16 v25, v8

    invoke-direct/range {v24 .. v29}, Lt59;-><init>(JJLjava/lang/String;)V

    move-wide/from16 v3, v25

    move-wide/from16 v8, v27

    iget-object v7, v7, Lu59;->b:Ljava/lang/Object;

    check-cast v7, Lnv6;

    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v14, v3, v4}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    invoke-virtual {v14, v8, v9}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    sget-object v3, Laik;->a:[Ljava/lang/String;

    if-nez v29, :cond_c

    const-string v3, ""

    goto :goto_3

    :cond_c
    move-object/from16 v3, v29

    :goto_3
    invoke-virtual {v14, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-virtual {v14}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v7, Lnv6;->a:Ljava/lang/Object;

    check-cast v4, Landroid/content/SharedPreferences;

    const-string v7, "persistent.installTime"

    invoke-static {v4, v7, v3}, Lcom/appsflyer/internal/j;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v24

    goto :goto_4

    :cond_d
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_f

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v4

    iget-object v4, v4, Ld6j;->d:Lx5f;

    iget-wide v7, v3, Lt59;->a:J

    iget-object v9, v3, Lt59;->c:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v14, v4, Lx5f;->d:Lzpa;

    invoke-static {}, Lzpa;->F()Lx56;

    move-result-object v12

    invoke-virtual {v12, v14}, Lx56;->I(Lzpa;)Lin0;

    move-result-object v14

    const/16 v2, 0x20

    invoke-virtual {v14, v2, v11, v7, v8}, Ljf0;->p(IIJ)V

    if-eqz v9, :cond_e

    const/16 v2, 0x21

    invoke-virtual {v14, v2, v11, v9}, Ljf0;->q(IILjava/lang/Object;)V

    :cond_e
    invoke-virtual {v4, v12}, Lx5f;->U0(Lx56;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ldj9;->t(Landroid/content/Context;)Ldj9;

    move-result-object v27

    new-instance v26, Lv59;

    iget-wide v2, v3, Lt59;->b:J

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v4

    iget-object v4, v4, Ld6j;->d:Lx5f;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v7

    iget-object v7, v7, Ld6j;->g:Lwsf;

    move-wide/from16 v28, v2

    move-object/from16 v30, v4

    move-object/from16 v31, v7

    invoke-direct/range {v26 .. v31}, Lv59;-><init>(Ldj9;JLx5f;Lwsf;)V

    move-object/from16 v3, v26

    move-object/from16 v2, v27

    invoke-virtual {v2, v3}, Lno7;->g(Lmo7;)V

    :cond_f
    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->q()Le59;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ltz5;->c()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "crash.count.delta.base"

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {}, Ltz5;->a()I

    move-result v4

    sub-int v2, v4, v2

    if-lez v2, :cond_10

    invoke-static {}, Ltz5;->c()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    invoke-interface {v7, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-boolean v11, v1, Lcom/opera/android/OperaApplication;->k:Z

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v3

    iget-object v3, v3, Ld6j;->c:Lx5f;

    iget-boolean v4, v3, Lx5f;->h:Z

    if-eqz v4, :cond_11

    iget-object v4, v3, Lx5f;->d:Lzpa;

    invoke-static {}, Lzpa;->F()Lx56;

    move-result-object v7

    invoke-virtual {v7, v4}, Lx56;->E(Lzpa;)Lfi0;

    move-result-object v4

    int-to-long v8, v2

    invoke-virtual {v4, v11, v11, v8, v9}, Ljf0;->p(IIJ)V

    invoke-virtual {v3, v7}, Lx5f;->U0(Lx56;)V

    goto :goto_5

    :cond_10
    iput-boolean v6, v1, Lcom/opera/android/OperaApplication;->k:Z

    :cond_11
    :goto_5
    sget-object v2, Li0i;->b:Lnx1;

    invoke-virtual {v2, v1}, Li7c;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt28;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v3

    iget-object v4, v1, Lcom/opera/android/OperaApplication;->u:Lt1;

    new-instance v7, Ls28;

    iget-object v8, v2, Lt28;->b:Lumi;

    invoke-direct {v7, v2, v8, v3, v4}, Ls28;-><init>(Lt28;Lumi;Lcom/opera/android/settings/SettingsManager;Lt1;)V

    iput-object v7, v2, Lt28;->d:Ls28;

    iget-object v7, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v8, v1, Lcom/opera/android/OperaApplication;->A:Lj4c;

    new-instance v2, Ljlf;

    new-instance v3, Lhz;

    invoke-direct {v3, v1, v11}, Lhz;-><init>(Ljava/lang/Object;B)V

    invoke-direct {v2, v1, v3}, Ljlf;-><init>(Lcom/opera/android/OperaApplication;Lhz;)V

    sget-object v3, Lilf;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v9, v2, :cond_12

    new-instance v2, Lmlf;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v3

    iget-object v3, v3, Ld6j;->c:Lx5f;

    invoke-direct {v2, v1, v15, v3}, Lmlf;-><init>(Lcom/opera/android/OperaApplication;Lumi;Lx5f;)V

    sput-object v2, Lnzc;->a:Lmlf;

    sput-object v2, Lfob;->e:Lmlf;

    :cond_12
    iget-object v2, v1, Lcom/opera/android/OperaApplication;->i:Ldu1;

    const v3, 0x71de74d2

    if-eqz v2, :cond_14

    new-instance v4, Ln9k;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v12

    iget-object v12, v12, Ld6j;->c:Lx5f;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v14

    const-string v6, "version_code"

    invoke-virtual {v14, v6}, Lcom/opera/android/settings/SettingsManager;->n(Ljava/lang/String;)I

    move-result v6

    if-eq v6, v3, :cond_13

    move v6, v11

    goto :goto_6

    :cond_13
    const/4 v6, 0x0

    :goto_6
    invoke-direct {v4, v12, v6}, Ln9k;-><init>(Ljava/lang/Object;Z)V

    iput-object v4, v2, Ldu1;->c:Ln9k;

    :cond_14
    iget-object v2, v1, Lcom/opera/android/OperaApplication;->p:Lrr3;

    if-eqz v2, :cond_15

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v2

    const-string v4, "version_code"

    invoke-virtual {v2, v4}, Lcom/opera/android/settings/SettingsManager;->n(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v3, :cond_15

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/opera/android/OperaApplication;->p:Lrr3;

    :cond_15
    new-instance v3, Lvl9;

    const/16 v4, 0x14

    invoke-direct {v3, v1, v4}, Lvl9;-><init>(Ljava/lang/Object;B)V

    invoke-static {v11, v3}, Lavj;->g(ILjava/lang/Runnable;)V

    new-instance v3, Ll4j;

    invoke-direct {v3}, Ll4j;-><init>()V

    invoke-virtual {v1, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance v3, Ljtm;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    move-object v3, v13

    new-instance v13, Lau1;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v14

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v16

    new-instance v4, Lox3;

    const/4 v6, 0x5

    invoke-direct {v4, v1, v6}, Lox3;-><init>(Lcom/opera/android/OperaApplication;B)V

    iget-object v12, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v12, v12, Lxv1;->S:Lj4c;

    invoke-virtual {v12}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v18, v12

    check-cast v18, Lf4b;

    iget-object v12, v1, Lcom/opera/android/OperaApplication;->x:Lj4c;

    move-object/from16 v17, v4

    move-object/from16 v19, v12

    move-object v12, v3

    invoke-direct/range {v13 .. v19}, Lau1;-><init>(Lcom/opera/android/settings/SettingsManager;Lumi;Landroid/content/Context;Lox3;Lf4b;Lj4c;)V

    invoke-virtual {v1, v13}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    move-object v3, v0

    new-instance v0, Liyc;

    move-object v4, v3

    new-instance v3, Lox3;

    const/4 v13, 0x6

    invoke-direct {v3, v1, v13}, Lox3;-><init>(Lcom/opera/android/OperaApplication;B)V

    move-object v13, v4

    new-instance v4, Lox3;

    const/4 v14, 0x7

    invoke-direct {v4, v1, v14}, Lox3;-><init>(Lcom/opera/android/OperaApplication;B)V

    move-object v14, v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    move-object v2, v15

    move-object/from16 v6, v22

    invoke-direct/range {v0 .. v5}, Liyc;-><init>(Lcom/opera/android/OperaApplication;Lumi;Lox3;Lox3;Lcom/opera/android/settings/SettingsManager;)V

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance v0, Lz0f;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v3

    iget-object v3, v3, Ld6j;->d:Lx5f;

    invoke-direct {v0, v2, v3}, Lz0f;-><init>(Lumi;Lx5f;)V

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v0, v0, Lxv1;->l0:Lj4c;

    invoke-virtual {v0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0f;

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lcom/opera/android/OperaApplication;->t:Lj4c;

    invoke-virtual {v0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnx5;

    new-instance v27, Lxtm;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v28

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lxnh;->t(Landroid/content/Context;)Lxnh;

    move-result-object v29

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v3

    iget-object v3, v3, Ld6j;->b:Lqfb;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v4

    iget-object v4, v4, Ld6j;->d:Lx5f;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v5

    iget-object v5, v5, Ld6j;->f:Losf;

    move-object/from16 v30, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    invoke-direct/range {v27 .. v32}, Lxtm;-><init>(Lcom/opera/android/settings/SettingsManager;Lxnh;Lqfb;Lx5f;Losf;)V

    new-instance v3, Lzpe;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v4

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->z()Lfue;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v15

    iget-object v15, v15, Ld6j;->c:Lx5f;

    invoke-direct {v3, v4, v5, v15}, Lzpe;-><init>(Lcom/opera/android/settings/SettingsManager;Lfue;Lx5f;)V

    new-instance v3, Lp1;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lxnh;->t(Landroid/content/Context;)Lxnh;

    move-result-object v4

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v5

    iget-object v5, v5, Ld6j;->d:Lx5f;

    invoke-direct {v3, v4, v5}, Lp1;-><init>(Lxnh;Lx5f;)V

    new-instance v3, Ltpk;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lxnh;->t(Landroid/content/Context;)Lxnh;

    move-result-object v4

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v15

    iget-object v15, v15, Ld6j;->c:Lx5f;

    invoke-direct {v3, v4, v5, v15}, Ltpk;-><init>(Lxnh;Lcom/opera/android/settings/SettingsManager;Lx5f;)V

    new-instance v3, Lhge;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->s()Lbf9;

    move-result-object v4

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v15

    iget-object v15, v15, Ld6j;->c:Lx5f;

    invoke-direct {v3, v4, v5, v15}, Lhge;-><init>(Lbf9;Lcom/opera/android/settings/SettingsManager;Lx5f;)V

    new-instance v3, Lw1;

    invoke-static {v1}, Lxnh;->t(Landroid/content/Context;)Lxnh;

    move-result-object v4

    iget-object v5, v7, Lxv1;->T0:Lj4c;

    invoke-virtual {v5}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llzj;

    new-instance v15, Lox3;

    const/16 v11, 0x8

    invoke-direct {v15, v1, v11}, Lox3;-><init>(Lcom/opera/android/OperaApplication;B)V

    invoke-direct {v3, v4, v5, v15}, Lw1;-><init>(Lxnh;Llzj;Lox3;)V

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v3

    invoke-virtual {v8}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llpe;

    iget-object v4, v4, Llpe;->k:Lcq5;

    new-instance v5, Lvr;

    const/16 v11, 0xb

    const/4 v15, 0x0

    invoke-direct {v5, v11, v15, v3}, Lvr;-><init>(BLmt5;Ljava/lang/Object;)V

    new-instance v3, Lz99;

    const/4 v11, 0x2

    invoke-direct {v3, v4, v5, v11}, Lz99;-><init>(Lf99;Lkotlin/jvm/functions/Function2;B)V

    move-object v4, v12

    invoke-static {v3, v0}, Lj14;->Y(Lf99;Lnx5;)Ld3k;

    new-instance v3, Lb4m;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    sget-object v15, Lio7;->A:Lio7;

    sget-object v12, Lbvn;->k:Lsjn;

    invoke-static {v11, v15, v12}, Lno7;->n(Landroid/content/Context;Lio7;Llo7;)Lno7;

    move-result-object v11

    check-cast v11, Lbvn;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->O()Lv3m;

    move-result-object v12

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v15

    iget-object v15, v15, Ld6j;->c:Lx5f;

    invoke-direct {v3, v5, v11, v12, v15}, Lb4m;-><init>(Lcom/opera/android/settings/SettingsManager;Lbvn;Lv3m;Lx5f;)V

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->D()Ljtg;

    move-result-object v3

    invoke-virtual {v3}, Ljtg;->b()Z

    move-result v3

    if-eqz v3, :cond_16

    new-instance v27, Ledb;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v28

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->y()Lfqe;

    move-result-object v29

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->u()Lm9c;

    move-result-object v30

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v5

    iget-object v5, v5, Ld6j;->d:Lx5f;

    iget-object v11, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v11, v11, Lxv1;->u0:Lj4c;

    invoke-virtual {v11}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v32, v11

    check-cast v32, Lvvg;

    move-object/from16 v31, v5

    invoke-direct/range {v27 .. v32}, Ledb;-><init>(Lslk;Lfqe;Lm9c;Lx5f;Lvvg;)V

    new-instance v5, Lhze;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->F()Lcom/opera/android/PushedContentHandler;

    move-result-object v11

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->E()Lgmk;

    move-result-object v12

    invoke-direct {v5, v1, v11, v12}, Lhze;-><init>(Lcom/opera/android/OperaApplication;Lcom/opera/android/PushedContentHandler;Lgmk;)V

    new-instance v5, Lq59;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->R()Lydn;

    move-result-object v11

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v12

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->E()Lgmk;

    move-result-object v15

    invoke-direct {v5, v11, v12, v15}, Lq59;-><init>(Lydn;Lslk;Lgmk;)V

    new-instance v5, Lrtg;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v11

    iget-object v11, v11, Ld6j;->d:Lx5f;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v12

    iget-object v12, v12, Lslk;->i:Lkze;

    invoke-direct {v5, v11, v12}, Lrtg;-><init>(Lx5f;Lkze;)V

    new-instance v5, Lwmk;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->R()Lydn;

    move-result-object v11

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v12

    invoke-direct {v5, v11, v12, v2}, Lwmk;-><init>(Lydn;Lslk;Lumi;)V

    new-instance v2, Lt77;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->u()Lm9c;

    move-result-object v11

    invoke-direct {v2, v5, v11}, Lt77;-><init>(Lslk;Lm9c;)V

    :cond_16
    new-instance v2, Lhze;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v11

    iget-object v11, v11, Ld6j;->d:Lx5f;

    new-instance v12, Lox3;

    move/from16 v15, v23

    invoke-direct {v12, v1, v15}, Lox3;-><init>(Lcom/opera/android/OperaApplication;B)V

    invoke-direct {v2, v5, v11, v12}, Lhze;-><init>(Lslk;Lx5f;Lox3;)V

    new-instance v2, Lrtg;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->M()Lslk;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v11

    iget-object v11, v11, Ld6j;->d:Lx5f;

    invoke-direct {v2, v5, v11}, Lrtg;-><init>(Lslk;Lx5f;)V

    iget-object v2, v1, Lcom/opera/android/OperaApplication;->v:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldp6;

    new-instance v5, Lbpd;

    invoke-virtual {v2}, Ldp6;->d()Lip6;

    move-result-object v11

    new-instance v12, Li3j;

    invoke-virtual {v2}, Ldp6;->b()Lole;

    move-result-object v15

    move/from16 v17, v3

    iget-object v3, v2, Ldp6;->j:Lbpd;

    move-object/from16 v18, v8

    iget-object v8, v2, Ldp6;->l:Llv1;

    invoke-direct {v12, v15, v3, v8}, Li3j;-><init>(Lole;Lbpd;Llv1;)V

    const/16 v3, 0xc

    invoke-direct {v5, v11, v12, v3}, Lbpd;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    new-instance v8, Lqe6;

    iget-object v2, v2, Ldp6;->t:Lzyk;

    invoke-virtual {v2}, Lzyk;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/euicc/EuiccManager;

    const/4 v11, 0x3

    invoke-direct {v8, v2, v11}, Lqe6;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v2

    iget-object v2, v2, Ld6j;->d:Lx5f;

    invoke-virtual {v5}, Lbpd;->G()Lbs4;

    move-result-object v5

    new-instance v11, Lxd6;

    const/4 v15, 0x5

    invoke-direct {v11, v5, v15}, Lxd6;-><init>(Ljava/lang/Object;B)V

    invoke-static {v11}, Lqbe;->t(Lf99;)Lf99;

    move-result-object v5

    new-instance v11, Lba8;

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-direct {v11, v2, v15, v12}, Lba8;-><init>(Lx5f;Lmt5;B)V

    invoke-static {v5, v0, v11}, Lw7d;->i(Lf99;Lnx5;Lkotlin/jvm/functions/Function2;)Ld3k;

    new-instance v5, Ls3;

    const/16 v11, 0x1c

    invoke-direct {v5, v2, v8, v15, v11}, Ls3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lmt5;B)V

    const/4 v11, 0x3

    invoke-static {v0, v15, v15, v5, v11}, Lna2;->B(Lnx5;Lkotlin/coroutines/CoroutineContext;Lrx5;Lkotlin/jvm/functions/Function2;I)Ld3k;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->S()Lien;

    move-result-object v2

    if-eqz v17, :cond_17

    invoke-virtual {v2}, Lyi2;->p()V

    iget-object v5, v2, Lyi2;->c:Ljava/lang/Object;

    check-cast v5, Lydn;

    iget-object v8, v2, Lyi2;->f:Ljava/lang/Object;

    check-cast v8, Lgen;

    iget-object v5, v5, Lydn;->u:Lh7f;

    invoke-virtual {v5, v8}, Lh7f;->b(Ljava/lang/Object;)Z

    iget-object v5, v2, Lien;->j:Lnzk;

    new-instance v8, Lvu1;

    const/4 v12, 0x2

    invoke-direct {v8, v2, v12}, Lvu1;-><init>(Ljava/lang/Object;B)V

    iget-object v2, v5, Lnzk;->b:Lh7f;

    invoke-virtual {v2, v8}, Lh7f;->b(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_17
    iget-object v5, v2, Lyi2;->a:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    const/4 v8, 0x0

    invoke-virtual {v2, v5, v8}, Lien;->l(Landroid/content/Context;Z)V

    :goto_7
    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->T()Lyen;

    move-result-object v2

    if-eqz v17, :cond_18

    invoke-virtual {v2}, Lyi2;->p()V

    iget-object v5, v2, Lyi2;->c:Ljava/lang/Object;

    check-cast v5, Lydn;

    iget-object v2, v2, Lyi2;->f:Ljava/lang/Object;

    check-cast v2, Lgen;

    iget-object v5, v5, Lydn;->u:Lh7f;

    invoke-virtual {v5, v2}, Lh7f;->b(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_18
    iget-object v5, v2, Lyi2;->a:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    const/4 v8, 0x0

    invoke-virtual {v2, v5, v8}, Lyen;->l(Landroid/content/Context;Z)V

    :goto_8
    iget-object v2, v1, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v2, v2, Lxv1;->T:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Latb;

    iget-object v5, v2, Latb;->c:Lnzk;

    new-instance v8, Lvu1;

    const/4 v11, 0x1

    invoke-direct {v8, v2, v11}, Lvu1;-><init>(Ljava/lang/Object;B)V

    iget-object v2, v5, Lnzk;->b:Lh7f;

    invoke-virtual {v2, v8}, Lh7f;->b(Ljava/lang/Object;)Z

    new-instance v2, Lohf;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->c()Lxb;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v8

    iget-object v8, v8, Ld6j;->d:Lx5f;

    invoke-direct {v2, v5, v8}, Lohf;-><init>(Lxb;Lx5f;)V

    new-instance v2, Lx79;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-static {v1}, Ldj9;->t(Landroid/content/Context;)Ldj9;

    move-result-object v8

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->F()Lcom/opera/android/PushedContentHandler;

    move-result-object v11

    iget-object v15, v7, Lxv1;->y0:Lj4c;

    iget-object v12, v7, Lxv1;->r1:Lj4c;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v5, v2, Lx79;->a:Ljava/lang/Object;

    iput-object v8, v2, Lx79;->b:Ljava/lang/Object;

    iput-object v11, v2, Lx79;->c:Ljava/lang/Object;

    iput-object v15, v2, Lx79;->d:Ljava/lang/Object;

    iput-object v12, v2, Lx79;->e:Ljava/lang/Object;

    new-instance v5, Lvy;

    const/4 v15, 0x5

    invoke-direct {v5, v2, v15}, Lvy;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v8, v5}, Lno7;->g(Lmo7;)V

    iget-object v2, v1, Lcom/opera/android/OperaApplication;->D:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk3i;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v8

    iget-object v8, v8, Ld6j;->d:Lx5f;

    invoke-virtual {v2}, Lk3i;->a()Likc;

    move-result-object v2

    new-instance v11, Lhze;

    invoke-direct {v11, v5, v8, v15}, Lhze;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-virtual {v2, v11}, Lekc;->k(Lf7f;)V

    iget-object v2, v1, Lcom/opera/android/OperaApplication;->J:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llz6;

    iget-object v2, v2, Llz6;->a:Lu7k;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v8

    iget-object v8, v8, Ld6j;->c:Lx5f;

    iget-object v2, v2, Lu7k;->a:Ljava/lang/Object;

    check-cast v2, Lzyk;

    invoke-virtual {v2}, Lzyk;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf99;

    new-instance v11, Lr3h;

    const/4 v12, 0x1

    const/4 v15, 0x0

    invoke-direct {v11, v15, v5, v12}, Lr3h;-><init>(Lmt5;Lcom/opera/android/settings/SettingsManager;B)V

    invoke-static {v2, v11}, Lma9;->b(Lf99;Lcr9;)Lbs4;

    move-result-object v2

    invoke-static {v2}, Lqbe;->t(Lf99;)Lf99;

    move-result-object v2

    new-instance v5, Lba8;

    const/4 v12, 0x2

    invoke-direct {v5, v8, v15, v12}, Lba8;-><init>(Lx5f;Lmt5;B)V

    invoke-static {v2, v0, v5}, Lw7d;->i(Lf99;Lnx5;Lkotlin/jvm/functions/Function2;)Ld3k;

    invoke-virtual/range {v18 .. v18}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llpe;

    iget-object v2, v2, Llpe;->q:Lplh;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v8

    iget-object v8, v8, Ld6j;->c:Lx5f;

    new-instance v11, Lr3h;

    const/4 v12, 0x0

    invoke-direct {v11, v15, v5, v12}, Lr3h;-><init>(Lmt5;Lcom/opera/android/settings/SettingsManager;B)V

    invoke-static {v2, v11}, Lma9;->b(Lf99;Lcr9;)Lbs4;

    move-result-object v2

    invoke-static {v2}, Lqbe;->t(Lf99;)Lf99;

    move-result-object v2

    new-instance v5, Lba8;

    const/4 v11, 0x1

    invoke-direct {v5, v8, v15, v11}, Lba8;-><init>(Lx5f;Lmt5;B)V

    invoke-static {v2, v0, v5}, Lw7d;->i(Lf99;Lnx5;Lkotlin/jvm/functions/Function2;)Ld3k;

    invoke-virtual/range {v18 .. v18}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llpe;

    iget-object v2, v2, Llpe;->t:Lplh;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v5

    new-instance v8, Lr8h;

    const/16 v11, 0xd

    invoke-direct {v8, v2, v5, v15, v11}, Lr8h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lmt5;B)V

    const/4 v11, 0x3

    invoke-static {v0, v15, v15, v8, v11}, Lna2;->B(Lnx5;Lkotlin/coroutines/CoroutineContext;Lrx5;Lkotlin/jvm/functions/Function2;I)Ld3k;

    iget-object v2, v7, Lxv1;->W:Lj4c;

    invoke-virtual {v2}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsnc;

    iget-object v2, v2, Lsnc;->o:Lzyk;

    invoke-virtual {v2}, Lzyk;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljpc;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lhpc;

    const/4 v8, 0x0

    invoke-direct {v5, v2, v15, v8}, Lhpc;-><init>(Ljpc;Lmt5;B)V

    invoke-static {v0, v15, v15, v5, v11}, Lna2;->B(Lnx5;Lkotlin/coroutines/CoroutineContext;Lrx5;Lkotlin/jvm/functions/Function2;I)Ld3k;

    new-instance v5, Lhpc;

    const/4 v12, 0x1

    invoke-direct {v5, v2, v15, v12}, Lhpc;-><init>(Ljpc;Lmt5;B)V

    invoke-static {v0, v15, v15, v5, v11}, Lna2;->B(Lnx5;Lkotlin/coroutines/CoroutineContext;Lrx5;Lkotlin/jvm/functions/Function2;I)Ld3k;

    invoke-virtual/range {v18 .. v18}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llpe;

    iget-object v2, v2, Llpe;->y:Ljdj;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->L()Ld6j;

    move-result-object v5

    iget-object v5, v5, Ld6j;->d:Lx5f;

    new-instance v7, Lqmb;

    invoke-direct {v7, v2, v5, v15, v3}, Lqmb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lmt5;B)V

    invoke-static {v0, v15, v15, v7, v11}, Lna2;->B(Lnx5;Lkotlin/coroutines/CoroutineContext;Lrx5;Lkotlin/jvm/functions/Function2;I)Ld3k;

    new-instance v0, Ls9c;

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->u()Lm9c;

    move-result-object v2

    invoke-direct {v0, v2}, Ls9c;-><init>(Lm9c;)V

    const/16 v2, 0x9

    invoke-static {v2, v0}, Lavj;->g(ILjava/lang/Runnable;)V

    sget-object v2, Lcom/opera/android/browser/obml/Platform;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->J()Lcom/opera/android/settings/SettingsManager;

    move-result-object v0

    const-string v2, "eula_accepted.gdpr"

    invoke-virtual {v0, v2}, Lcom/opera/android/settings/SettingsManager;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {v1, v15}, Lcom/opera/android/OperaApplication;->W(Landroid/app/Activity;)V

    :cond_19
    invoke-virtual {v1}, Lcom/opera/android/OperaApplication;->v()Lfs6;

    move-result-object v0

    iget-object v0, v0, Lfs6;->d:Ljze;

    invoke-static {v0}, Lb8h;->d(Lekc;)Lh42;

    move-result-object v0

    new-instance v2, Lrkc;

    const/4 v15, 0x5

    invoke-direct {v2, v1, v15}, Lrkc;-><init>(Ljava/lang/Object;B)V

    new-instance v3, Liwa;

    const/4 v15, 0x4

    invoke-direct {v3, v2, v15}, Liwa;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {v0, v3}, Lekc;->k(Lf7f;)V

    invoke-static {v1}, Lru9;->c(Landroid/content/Context;)Lru9;

    move-result-object v0

    iget-object v0, v0, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v2, "clearonexit.categories.ongoing"

    invoke-static {v0, v2}, Lw1h;->m(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    const/4 v15, 0x0

    if-nez v2, :cond_1a

    invoke-static {v1, v15}, Lz4o;->z0(Landroid/content/ContextWrapper;Ljava/util/HashSet;)V

    const-string v2, "ClearOnExit never finished"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lks3;->B(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    invoke-static {v1}, Lru9;->c(Landroid/content/Context;)Lru9;

    move-result-object v0

    iget-object v2, v0, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v3, "osp.analytics_host"

    invoke-interface {v2, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v5, "osp.analytics_key"

    invoke-interface {v3, v5, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v2, v3}, Lz43;->C(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v0, Lru9;->a:Landroid/content/SharedPreferences;

    const-string v2, "osp.requests_host"

    invoke-interface {v0, v2, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "osp.requests_key"

    invoke-interface {v0, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v2, v3}, Lz43;->C(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "osp.behavior_host"

    invoke-interface {v0, v2, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "osp.behavior_key"

    invoke-interface {v0, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v2, v3}, Lz43;->C(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "osp.onboarding_host"

    invoke-interface {v0, v2, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "osp.onboarding_key"

    invoke-interface {v0, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Lz43;->C(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "osp.domains_host"

    invoke-interface {v0, v2, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "osp.domains_key"

    invoke-interface {v0, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Lz43;->C(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x23

    if-lt v9, v0, :cond_1b

    const-class v0, Landroid/app/ActivityManager;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v1}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lgif;

    invoke-direct {v3, v1}, Lgif;-><init>(Lcom/opera/android/OperaApplication;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/ActivityManager;->addApplicationStartInfoCompletionListener(Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    :cond_1b
    iget-boolean v0, v1, Lcom/opera/android/OperaApplication;->j:Z

    if-eqz v0, :cond_1c

    sget-object v0, Lrog;->a:Lanf;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.os.action.POWER_SAVE_MODE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1c
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.opera.android.action.APP_START"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_a

    :goto_9
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_1d
    :goto_a
    return-void
.end method

.method public final p()Lxt8;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->I:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxt8;

    return-object p0
.end method

.method public final q()Le59;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->K:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le59;

    return-object p0
.end method

.method public final r()Lg89;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->L:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg89;

    return-object p0
.end method

.method public final s()Lbf9;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->M:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbf9;

    return-object p0
.end method

.method public final startActivity(Landroid/content/Intent;)V
    .locals 3

    new-instance v0, Lhda;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lhda;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p0, p1, v0}, Lrm5;->z(Landroid/content/ContextWrapper;Landroid/content/Intent;Lkotlin/jvm/functions/Function2;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lalo;->R(Landroid/content/ContextWrapper;Landroid/content/Intent;)V

    invoke-super {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 3

    .line 22
    new-instance v0, Lhda;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lhda;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p0, p1, v0}, Lrm5;->z(Landroid/content/ContextWrapper;Landroid/content/Intent;Lkotlin/jvm/functions/Function2;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-static {p0, p1}, Lalo;->R(Landroid/content/ContextWrapper;Landroid/content/Intent;)V

    .line 24
    invoke-super {p0, p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public final t()Lr9c;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->U:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr9c;

    return-object p0
.end method

.method public final u()Lm9c;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->V:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm9c;

    return-object p0
.end method

.method public final v()Lfs6;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->W:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsnc;

    invoke-virtual {p0}, Lsnc;->a()Lfs6;

    move-result-object p0

    return-object p0
.end method

.method public final w()Lj4c;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->W:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsnc;

    iget-object p0, p0, Lsnc;->m:Lj4c;

    return-object p0
.end method

.method public final x()Ltjg;
    .locals 2

    iget-object v0, p0, Lcom/opera/android/OperaApplication;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/opera/android/OperaApplication;->d:Ltjg;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object v1, v1, Lxv1;->a0:Lqv1;

    invoke-virtual {v1}, Lqv1;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltjg;

    iput-object v1, p0, Lcom/opera/android/OperaApplication;->d:Ltjg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final y()Lfqe;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->d0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfqe;

    return-object p0
.end method

.method public final z()Lfue;
    .locals 0

    iget-object p0, p0, Lcom/opera/android/OperaApplication;->r:Lxv1;

    iget-object p0, p0, Lxv1;->k0:Lj4c;

    invoke-virtual {p0}, Lcom/opera/android/Lazy;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfue;

    return-object p0
.end method
