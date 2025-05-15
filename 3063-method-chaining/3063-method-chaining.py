import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    res = animals[animals['weight']>100]
    sorted_res = res.sort_values(by='weight', ascending=False)
    return sorted_res[['name']]