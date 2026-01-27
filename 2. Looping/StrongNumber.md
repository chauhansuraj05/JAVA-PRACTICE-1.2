

---

## 🔹 Why do we use `temp` in this program?

### Short answer (exam / viva):

> We use `temp` to **preserve the original value of `num`**, because `num` gets changed while extracting digits.

---

## 🔹 Detailed Explanation (step-by-step)

### 1️⃣ What happens in digit extraction?

To get digits, we do:

```java
digit = temp % 10;
temp = temp / 10;
```

* `% 10` → gets **last digit**
* `/ 10` → **removes last digit**

👉 This process **destroys the number**.

---

### 2️⃣ Why not use `num` directly?

If we write:

```java
while (num > 0) {
    digit = num % 10;
    num = num / 10;
}
```

After the loop:

* `num` becomes **0**
* Original number **145 is lost**

Then this comparison:

```java
if (sum == num)
```

becomes:

```java
if (sum == 0)   ❌ WRONG
```

So the result will always be **Not a Strong Number**.

---

### 3️⃣ Role of `temp`

```java
int temp = num;
```

* `num` → stores **original number (145)**
* `temp` → used only for **digit processing**

So:

* `temp` becomes `0` after loop ✔
* `num` remains `145` ✔
* Correct comparison is possible ✔

---

## 🔹 Simple Flow (Very Clear)

| Variable | Purpose                               |
| -------- | ------------------------------------- |
| `num`    | Stores original number for comparison |
| `temp`   | Used to extract digits safely         |
| `sum`    | Stores sum of factorials              |

---

## 🔹 One-line Viva Answer ⭐

> We use `temp` because extracting digits modifies the number, and we need the original number for comparison.

---

## 🔹 Alternative (When NOT using `temp`)

If teacher says **“don’t use temp”**, then we must:

* Use **String method**
* Or store digits separately

