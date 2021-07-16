#Zyquier Brownridge
#hw9
#11/17/2020

import pandas as pd
import matplotlib.pyplot as plt


# read the  file into a dataframe
data = pd.read_csv('Groceries_dataset.csv')

# I counted the total of each unique value In the itemDescription column and it returns the top 10 highest
z = data['itemDescription'].value_counts().nlargest(10)

# I then printed the Z to see the highest 10 and theses were the results with the corresponding popularity result
print(z)

#  stored the x values in the I variable and y values of the occurences x values in the amount variable

i = ["whole milk", "other vegetables", "rolls/buns", "soda", "yogurt", "root vegetables", "tropical fruit",
     "bottled water", "sausage", "citrus fruit"]

amount = [2502, 1898, 1716, 1514, 1334, 1071, 1032, 933, 924, 812]

#
plt.bar(i, amount)
plt.title('Popular Grocery Items')
plt.xlabel('Items')
plt.ylabel('Occurences')
plt.show()
