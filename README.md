# Smart Recipe Generator (Plain Java - Skeleton)

It contains:
- simple model classes (`Recipe`, `Ingredient`, `NutritionInfo`)
- an in-memory `RecipeDatabase` with a few hardcoded recipes
- a naive `RecipeGenerator` that filters recipes
- a small in-memory `UserFeedbackStore` (favorites/ratings) but not wired into anything

## How to compile and run (Windows PowerShell)

From the project root:

```powershell
cd "path of the project folder"
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
java -cp out com.smartrecipe.Main
```


