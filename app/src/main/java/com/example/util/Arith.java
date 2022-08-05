package com.example.util;
import java.math.BigDecimal;
public class Arith {

	// Ĭ?����?�㾫��
	private static final int DEF_DIV_SCALE = 10;

	// ???����?����
	private Arith() {
	}

public static String add(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return String.valueOf(b1.add(b2));
		}

/**
 * �ṩ��ȷ�ļ������㡣
 *
 * @param v1
 * ������
 * @param v2
 * ����
 * @return ���������Ĳ�
 */
public static String sub(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return String.valueOf(b1.subtract(b2));
		}

/**
 * �ṩ��ȷ�ĳ˷����㡣
 *
 * @param v1
 * ������
 * @param v2
 * ����
 * @return ���������Ļ�
 */
public static String mul(String v1, String v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return String.valueOf(b1.multiply(b2));
		}

/**
 * �ṩ����ԣ���ȷ�ĳ������㣬�����������������ʱ����ȷ�� С�����Ժ�10λ���Ժ�������������롣
 *
 * @param v1
 * ������
 * @param v2
 * ����
 * @return ������������
 */
public static String div(String v1, String v2) {
		return div(v1, v2, DEF_DIV_SCALE);
		}

/**
 * �ṩ����ԣ���ȷ�ĳ������㡣�����������������ʱ����scale����ָ �����ȣ��Ժ�������������롣
 *
 * @param v1
 * ������
 * @param v2
 * ����
 * @param scale
 * ��ʾ��ʾ��Ҫ��ȷ��С�����Ժ�λ��
 * @return ������������
 */
public static String div(String v1, String v2, int scale) {
		if (scale < 0) {
		throw new IllegalArgumentException(
		"The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return String.valueOf(b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP));
		}

/**
 * �ṩ��ȷ��С��λ�������봦��
 *
 * @param v
 * ��Ҫ�������������
 * @param scale
 * С���������λ
 * @return ���������Ľ��
 */
public static String round(String v, int scale) {
		if (scale < 0) {
		throw new IllegalArgumentException(
		"The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(v);
		BigDecimal one = new BigDecimal("1");
		return String.valueOf(b.divide(one, scale, BigDecimal.ROUND_HALF_UP));
		}

		}