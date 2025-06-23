# Sakontrolo I

✔ Created 'Detail Item' component
✔ Created 'Onboarding' component
✔ OnClick 'Buy Now' Button -> appear 'Onboarding'

<h2>Detail Item</h2>

![details](https://github.com/user-attachments/assets/67c4c58f-6dd3-48cd-b224-e042c1531254)


<h2>Onboarding</h2>

![onboarding](https://github.com/user-attachments/assets/76804efa-d20f-403d-9d92-2895129f6046)


<h2>functionality</h2>

class DetailItem : Fragment(R.layout.fragment_detail_item) {


    private lateinit var buyNowButton: MaterialButton
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        buyNowButton = view.findViewById(R.id.buyNowButton)

        buyNowButton.setOnClickListener{
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.main, Onboarding())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

}


⚠️ The logic part of the assignment is done 'blindly' 
⚠️ My laptop can not handle Android Studio
⚠️ I couldn't check and run the code


## 🛠️ Tech stuff

- Language: Kotlin / Java
- Editor: Android Studio


## 📦 Installation

1. Clone the repository:
    ```bash
   git clone https://github.com/Mari-Tchokhuri/Sakontrolo1.git
