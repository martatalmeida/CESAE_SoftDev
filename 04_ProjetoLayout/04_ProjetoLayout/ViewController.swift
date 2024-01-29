//
//  ViewController.swift
//  04_ProjetoLayout
//
//  Created by Marta Almeida on 22/01/2024.
//

import UIKit

class ViewController: UIViewController {

    
    @IBOutlet weak var primeiroNome: UITextField!
    @IBOutlet weak var ultimoNome: UITextField!
    @IBOutlet weak var textResultado: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
        
        
    @IBAction func botaoDizerOla(_ sender: Any) {
        let pNome = primeiroNome.text!
        let uNome = ultimoNome.text!
                
        if(pNome.isEmpty || uNome.isEmpty){
            textResultado.text = "Nome não inserido"
        }
        else {
            textResultado.text = "Olá \(pNome) \(uNome)"
        }
    }
   
            
    
    
}

