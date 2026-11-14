package com.leanplum.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.leanplum.internal.Constants;
import defpackage.sko;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AESCrypt {
    private static final String APP_ID_KEY_PREFIX = "Lq3fz";
    private static final String APP_ID_KEY_SUFFIX = "bLti2";
    private final String appId;
    private final String token;

    /* renamed from: com.leanplum.internal.AESCrypt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$leanplum$internal$AESCrypt$EncryptionType;

        static {
            int[] iArr = new int[EncryptionType.values().length];
            $SwitchMap$com$leanplum$internal$AESCrypt$EncryptionType = iArr;
            try {
                iArr[EncryptionType.LEGACY_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$leanplum$internal$AESCrypt$EncryptionType[EncryptionType.APP_ID_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum EncryptionType {
        LEGACY_TOKEN(0),
        APP_ID_KEY(1);

        public final int id;
        public final String prefix;
        public final String prefixWithBracket;

        EncryptionType(int i) {
            this.id = i;
            String str = String.format("%02d", Integer.valueOf(i));
            this.prefix = str;
            this.prefixWithBracket = str.concat("[");
        }

        private static EncryptionType forId(int i) {
            if (i == 1) {
                return APP_ID_KEY;
            }
            return null;
        }

        public static Pair<EncryptionType, String> parseCipherText(String str) {
            if (str != null && !str.isEmpty()) {
                if (str.startsWith("[")) {
                    return Pair.create(LEGACY_TOKEN, str);
                }
                EncryptionType encryptionType = APP_ID_KEY;
                if (str.startsWith(encryptionType.prefixWithBracket)) {
                    return Pair.create(encryptionType, str.substring(encryptionType.prefixWithBracket.length() - 1));
                }
            }
            return null;
        }
    }

    public AESCrypt(String str, String str2) {
        this.appId = str;
        this.token = str2;
    }

    private String appIdKeyPassword() {
        return APP_ID_KEY_PREFIX + this.appId + APP_ID_KEY_SUFFIX;
    }

    private static String decryptInternal(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] ciphertextInternal;
        try {
            ciphertextInternal = parseCiphertextInternal(str2);
        } catch (UnsupportedEncodingException e) {
            Log.d("Could not encode UTF8 string.\n" + Log.getStackTraceString(e), new Object[0]);
        }
        if (ciphertextInternal == null) {
            Log.d("Invalid ciphertext: " + str2, new Object[0]);
            return null;
        }
        byte[] bArrPerformCryptOperation = performCryptOperation(2, str, ciphertextInternal);
        if (bArrPerformCryptOperation != null) {
            return new String(bArrPerformCryptOperation, "UTF-8");
        }
        return null;
    }

    public static String encryptInternal(String str, String str2) {
        try {
            return Arrays.toString(performCryptOperation(1, str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            Log.d(sko.j("Unable to encrypt ", str2), e);
            return null;
        }
    }

    private static byte[] parseCiphertextInternal(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() < 2) {
            return null;
        }
        try {
            String[] strArrSplit = strTrim.substring(1, strTrim.length() - 1).trim().split("\\s*,\\s*");
            byte[] bArr = new byte[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                bArr[i] = Byte.parseByte(strArrSplit[i]);
            }
            return bArr;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static byte[] performCryptOperation(int i, String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        try {
            byte[] bytes = Constants.Crypt.SALT.getBytes("UTF-8");
            byte[] bytes2 = Constants.Crypt.IV.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithMD5And128BitAES-CBC-OpenSSL").generateSecret(new PBEKeySpec(str.toCharArray(), bytes, 1000, Constants.Crypt.KEY_LENGTH)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, new IvParameterSpec(bytes2));
            return cipher.doFinal(bArr);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public String decodePreference(SharedPreferences sharedPreferences, String str, String str2) {
        String strDecrypt;
        String string = sharedPreferences.getString(str, null);
        return (string == null || (strDecrypt = decrypt(string)) == null) ? str2 : strDecrypt;
    }

    public String decrypt(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Pair<EncryptionType, String> cipherText = EncryptionType.parseCipherText(str);
        String strDecryptInternal = null;
        if (cipherText == null) {
            Log.d(sko.j("Got null encryptionSpec for encrypted: ", str), new Object[0]);
        } else {
            int i = AnonymousClass1.$SwitchMap$com$leanplum$internal$AESCrypt$EncryptionType[((EncryptionType) cipherText.first).ordinal()];
            if (i == 1) {
                String str2 = this.token;
                if (str2 == null || str2.isEmpty()) {
                    Log.e("Decrypt called with null token.", new Object[0]);
                } else {
                    String strDecryptInternal2 = decryptInternal(this.token, (String) cipherText.second);
                    if (strDecryptInternal2 != null && parseCiphertextInternal(strDecryptInternal2) != null) {
                        Log.e("Discarding legacy value that appears to be an encrypted value: ".concat(strDecryptInternal2), new Object[0]);
                        return null;
                    }
                    strDecryptInternal = strDecryptInternal2;
                }
            } else if (i == 2) {
                String str3 = this.appId;
                if (str3 == null || str3.isEmpty()) {
                    Log.e("Decrypt called with null appId.", new Object[0]);
                } else {
                    strDecryptInternal = decryptInternal(appIdKeyPassword(), (String) cipherText.second);
                }
            }
        }
        if (strDecryptInternal == null) {
            Log.d(sko.j("Unable to decrypt ", str), new Object[0]);
        }
        return strDecryptInternal;
    }

    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.appId;
        if (str2 == null || str2.isEmpty()) {
            Log.e("Encrypt called with null appId.", new Object[0]);
            return null;
        }
        String strEncryptInternal = encryptInternal(appIdKeyPassword(), str);
        if (strEncryptInternal == null) {
            Log.d("Failed to encrypt.", new Object[0]);
            return null;
        }
        if (!strEncryptInternal.isEmpty() && !strEncryptInternal.equals(str) && strEncryptInternal.startsWith("[")) {
            return z1m.l(new StringBuilder(), EncryptionType.APP_ID_KEY.prefix, strEncryptInternal);
        }
        Log.d("Invalid ciphertext: ".concat(strEncryptInternal), new Object[0]);
        return null;
    }
}
