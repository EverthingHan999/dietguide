/******************************************************************************************
 * �������ǿ��
 ******************************************************************************************/
checkPasswordLevel = function (strPassword) {
    var result = 0;
    if (strPassword.length == 0)
        result += 0;
    else if (strPassword.length < 8 && strPassword.length > 0)
        result += 5;
    else if (strPassword.length > 10)
        result += 25;
    else
        result += 10;

    //check letter
    var bHave = false;
    var bAll = false;
    var capital = strPassword.match(/[A-Z]{1}/);//�Ҵ�д��ĸ
    var small = strPassword.match(/[a-z]{1}/);//��Сд��ĸ
    if (capital == null && small == null) {
        result += 0; //û����ĸ
        bHave = false;
    } else if (capital != null && small != null) {
        result += 20;
        bAll = true;
    } else {
        result += 10;
        bAll = true;
    }
    //alert("�����ĸ��"+result);

    //�������
    var bDigi = false;
    var digitalLen = 0;
    for (var i = 0; i < strPassword.length; i++) {

        if (strPassword.charAt(i) <= '9' && strPassword.charAt(i) >= '0') {
            bDigi = true;
            digitalLen += 1;
            //alert(strPassword[i]);
        }

    }
    if (digitalLen == 0)//û������
    {
        result += 0;
        bDigi = false;
    } else if (digitalLen > 2)//2����������
    {
        result += 20;
        bDigi = true;
    } else {
        result += 10;
        bDigi = true;
    }
    //alert("���ָ�����" + digitalLen);
    //alert("������֣�"+result);

    //���ǵ����ַ�
    var bOther = false;
    var otherLen = 0;
    for (var i = 0; i < strPassword.length; i++) {
        if ((strPassword.charAt(i) >= '0' && strPassword.charAt(i) <= '9') ||
            (strPassword.charAt(i) >= 'A' && strPassword.charAt(i) <= 'Z') ||
            (strPassword.charAt(i) >= 'a' && strPassword.charAt(i) <= 'z'))
            continue;
        otherLen += 1;
        bOther = true;
    }
    if (otherLen == 0)//û�зǵ����ַ�
    {
        result += 0;
        bOther = false;
    } else if (otherLen > 1)//1�����Ϸǵ����ַ�
    {
        result += 25;
        bOther = true;
    } else {
        result += 10;
        bOther = true;
    }
    //alert("���ǵ��ʣ�"+result);

    //�����⽱��
    if (bAll && bDigi && bOther)
        result += 5;
    else if (bHave && bDigi && bOther)
        result += 3;
    else if (bHave && bDigi)
        result += 2;
    //alert("�����⽱����"+result);

    var level = "";
    //���ݷ�����������ǿ�ȵĵȼ�
    if (result >= 80)
        level = "rank r7";
    else if (result >= 70)
        level = "rank r6";
    else if (result >= 60)
        level = "rank r5";
    else if (result >= 50)
        level = "rank r4";
    else if (result >= 40)
        level = "rank r3";
    else if (result > 20)
        level = "rank r2";
    else if (result > 0)
        level = "rank r1";
    else
        level = "rank r0";

//		alert("return:"+level);
    return level.toString();
}


/******************************************************************************************
 * ��������ǿ����ʽ
 ******************************************************************************************/
setPasswordLevel = function (passwordObj, levelObj) {
    var level = "rank r0";
    level = checkPasswordLevel(passwordObj.value);
    levelObj.className = level;
//alert("level"+level);
}