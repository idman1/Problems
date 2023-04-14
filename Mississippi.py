word = "Mississippi"
i_in_word = 0
s_in_word = 0
i = '0'
for i in word:
    if i == "i":
        i_in_word +=1
    elif i == "s":
        s_in_word+=1
    print("number of I in Mississippi"+i_in_word+"number of S in Mississippi"+s_in_word)
